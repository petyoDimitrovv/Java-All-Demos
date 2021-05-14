import entities.Address;
import entities.Employee;
import entities.Project;
import entities.Town;

import javax.persistence.EntityManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Engine implements Runnable {
    private final EntityManager entityManager;
    private final BufferedReader reader;

    public Engine(EntityManager entityManager, BufferedReader reader) {
        this.entityManager = entityManager;
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        String task = "";
        System.out.println("Please choose a task number from 2 to 13: ");

        try {
            task = reader.readLine();
        } catch (IOException e) {

        }
        try {
            switch (task) {
                case "2":
                    changeCasingEx2();
                    break;
                case "3":
                    containsEmployeeEx3();
                    break;
                case "4":
                    employeesWithSalaryOver50000Ex4();
                    break;
                    case "5":
                        employeesFromDepartmentEx5();
                    break;
                    case "6":
                       createAddressFromInputEx6();
                    break;
                    case "7":
                        addressesWithEmployeeCountEx7();
                    break;
                    case "8":
                        getEmployeeWithProjectsEx8();
                    break;
                    case "9":
                        findLatest10ProjectsEx9();
                    break;
                    case "10":
                        increaseSalariesEx10();
                    break;
                case "11":
                    findEmployeesByFirstNameEx11();
                    break;

                case "12":
                    employeesMaxSalariesEx12();
                    break;




            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void employeesMaxSalariesEx12() {
        entityManager
                .createQuery("SELECT e.department.name , MAX(e.salary)  " +
                        "FROM Employee e " +
                        "GROUP BY e.department.name " +
                        "HAVING MAX (e.salary) NOT BETWEEN 30000 AND 70000 ", Employee.class)
                .getResultStream()
                .forEach(employee -> {
                    System.out.printf("%s %.2f",
                            employee.getDepartment().getName(),
                            employee.getSalary()
                            );
                });
    }

    private void findEmployeesByFirstNameEx11() throws IOException {
        System.out.println("Enter the name pattern here:");

        String pattern = reader.readLine();

        entityManager
                .createQuery("SELECT e FROM Employee e " +
                        "WHERE e.firstName LIKE concat(:pattern, '%')", Employee.class)
                .setParameter("pattern", pattern)
                .getResultStream()
                .forEach(employee -> {
                    System.out.printf("%s %s - %s - ($%.2f)",
                            employee.getFirstName(),
                            employee.getLastName(),
                            employee.getDepartment().getName(),
                            employee.getSalary()
                            );
                });
    }

    private void increaseSalariesEx10() {
        entityManager.getTransaction().begin();
         entityManager.
                 createQuery("UPDATE Employee e " +
                "SET e.salary = e.salary * 1.12 " +
                " WHERE e.department.id in (1, 2, 4, 11)")
                .executeUpdate();
         entityManager.getTransaction().commit();

               entityManager.createQuery("SELECT e FROM Employee e " +
                       "WHERE e.department.id in (1, 2, 4, 11)" , Employee.class)
                       .getResultStream()
                       .forEach(employee -> {
                    System.out.printf("%s %s ($%.2f)%n",
                            employee.getFirstName(),
                            employee.getLastName(),
                            employee.getSalary());
                });

    }

    private void findLatest10ProjectsEx9() {
   List<Project>projects = entityManager
           .createQuery("SELECT p FROM Project p " +
                   "ORDER BY p.name , p.startDate DESC ", Project.class)
           .setMaxResults(10)
           .getResultList();

        projects.forEach(project -> {
            System.out.printf("Project name: %s%n" +
                    "\tProject Description: %s%n" +
                    "\tProject Start Date: %s%n" +
                    " \tProject End Date: %s%n",
                    project.getName(),
                    project.getDescription(),
                    project.getStartDate(),
                    project.getEndDate());
        });

    }

    private void getEmployeeWithProjectsEx8() throws IOException {
        System.out.println("Enter an employee id here:");
        int id = Integer.parseInt(reader.readLine());
        Employee employee = entityManager
                .find(Employee.class, id);

        System.out.printf("%s %s - %s%n",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getJobTitle());

        employee.getProjects()
                .stream()
                .sorted(Comparator.comparing(Project::getName))
                .forEach(project -> {
                    System.out.printf("\t%s%n",project.getName());
                });


    }

    private void addressesWithEmployeeCountEx7() {
          entityManager
                .createQuery("SELECT a FROM Address a " +
                        "order by a.employees.size DESC ",Address.class)
                .setMaxResults(10)
                .getResultList()
                .forEach(address -> {
                    System.out.printf("%s, %s - %d%n",
                            address.getText(),
                            address.getTown().getName(),
                            address.getEmployees().size());
                });
    }

    private void createAddressFromInputEx6() throws IOException {
        Address address = createAddress("Vitoshka 15");

        System.out.println("Please enter the employee last name:");
        String lastName = reader.readLine();

        Employee employee = entityManager.createQuery("SELECT e FROM Employee e " +
                "WHERE e.lastName = :name", Employee.class)
                .setParameter("name", lastName)
                .getSingleResult();

//        Employee employee = entityManager
//                .find(Employee.class, lastName );

        entityManager.getTransaction().begin();
        employee.setAddress(address);
        entityManager.getTransaction().commit();



    }


    private void employeesFromDepartmentEx5() {
        entityManager.
                createQuery("SELECT e FROM Employee e WHERE e.department.id = 6 " +
                        "ORDER BY e.salary, e.id", Employee.class)
                .getResultStream()
                .forEach(employee -> {
                    System.out.printf("%s %s from %s - $%.2f%n",
                            employee.getFirstName(),
                            employee.getLastName(),
                            employee.getDepartment().getName(),
                            employee.getSalary());
                });
        System.out.println();
    }

    private void employeesWithSalaryOver50000Ex4() {
        System.out.println("Enter employee first name:");
        entityManager
                .createQuery("SELECT  e FROM Employee e " +
                        "WHERE e.salary > 50000", Employee.class)
                .getResultStream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);
    }

    private void containsEmployeeEx3() throws IOException {
        String fullName = reader.readLine();
        List<Employee> employees = entityManager
                .createQuery("SELECT e FROM Employee e " +
                        "WHERE concat(e.firstName, ' ', e.lastName) = :name", Employee.class)
                .setParameter("name", fullName)
                .getResultList();
        System.out.println(employees.size() == 0 ? "NO" : "YES");

    }

    private void changeCasingEx2() {
        List<Town> towns = entityManager
                .createQuery("SELECT t FROM  Town t " +
                        "WHERE length(t.name) <= 5  ", Town.class)
                .getResultList();
        entityManager.getTransaction().begin();
        towns.forEach(entityManager::detach);
        for (Town town : towns) {
            town.setName(town.getName().toLowerCase());

        }
        towns.forEach(entityManager::merge);
        entityManager.flush();
        entityManager.getTransaction().commit();

    }

    private Address createAddress(String addressText) {
        Address address = new Address();
        address.setText(addressText);

        entityManager.getTransaction().begin();
        entityManager.persist(address);
        entityManager.getTransaction().commit();

        return address;
    }
}

