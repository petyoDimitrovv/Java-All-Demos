package course.springdata.hibernateintro.entity;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Optional;

public class HibernateIntroMain {
    public static void main(String[] args) {
        // 1. Create Hibernate config
        Configuration cfg = new Configuration();
        cfg.configure();

        // 2. Create hibernate session factory
        SessionFactory sf = cfg.buildSessionFactory();

        // 3. Create hib session
        Session session = sf.openSession();


        // 4.Persist an entity
        Student student = new Student("Vanko Bir");
        session.beginTransaction();
        session. save(student);
        session.getTransaction().commit();

        // Read entity by id

        session.beginTransaction();
        session.setHibernateFlushMode(FlushMode.MANUAL);
        Optional<Student> result = session.byId(Student.class).loadOptional(1L);
        session.getTransaction().commit();
        System.out.printf("Student: %s",result.orElseGet(() -> null));

        // List all students using HQL
        session.beginTransaction();
        session.createQuery("FROM Student",Student.class)
                .setFirstResult(5)
                .setMaxResults(10)
                .stream()
                .forEach(System.out::println);
        session.getTransaction().commit();

        System.out.println("\n----------------------------------------");
        session.createQuery("FROM Student WHERE name = :name", Student.class)
                .setParameter("name", "bai hui")
                .stream().forEach(System.out::println);

        // Type safe query
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> query = cb.createQuery(Student.class);
        Root<Student> Student_ = query.from(Student.class);
        query.select(Student_).where(cb.like(Student_.get("name"),"b%"));
        session.createQuery(query).getResultStream()
                .forEach(System.out::println);



        // 5. Close session
        session.close();

    }
}
