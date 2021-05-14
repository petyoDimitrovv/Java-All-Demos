import org.w3c.dom.ls.LSOutput;

public class Employee {
    private String name;
    private double salary;
    private String department;
    private String position;
    private String email;
    private int age;

    public Employee(String name, Double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
       this.email = "n/a";
        this.age = -1;


    }

    public Employee(String name, Double salary, String position, String department, String email) {
        this(name, salary, position, department);
        this.email = email;

    }
    public Employee (String name, Double salary, String position, String department, int age) {
        this(name, salary, position, department);
        this.age = age;
}

    public Employee(String name, double salary, String department, String position, String email, int age) {
        this(name, salary, position, department, email);
        this.age = age;
    }

    public double getSalary() {
        return salary;


    }

    @Override
    public String toString() {
        return String.format( "%s %.2f %s %d",name, salary, email,age);
    }
}

