import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static final String GRINGOTTS_DB = "gringodds";
    private static final String SALES_PU = "sales";
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory(SALES_PU);

//        EntityManager entityManager = emf.createEntityManager();
//        Engine engine = new Engine(entityManager);
//        engine.run();

    }
}
