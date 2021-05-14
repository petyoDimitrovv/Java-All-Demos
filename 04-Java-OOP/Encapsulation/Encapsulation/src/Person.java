public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 0);
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.startSalary(salary);
        this.setLastName(lastName);
        this.setAge(age);
        this.startSalary(salary);
    }

    private void startSalary(double salary) {
        if(this.salary < 460.0 ){
            throw new IllegalStateException("Salary can't be less than 460.0");
        }
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.startSalary(salary);
    }

    private void setAge(int age) {
        if(this.age <= 0){
            throw new IllegalStateException("Age must not be zero or negative integer");
        }
        this.age = age;
    }

    private void setFirstName(String firstName) {
        if(this.firstName.length() <= 3){
            throw new IllegalStateException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;

    }

    private void setLastName(String lastName) {
        if(this.lastName.length() <= 3){
            throw new IllegalStateException("Last name cannot be less than 3 symbols");
        }

        this.lastName = lastName;
    }

    public void increaseSalary(double amount) {
        if (this.getAge() > 30) {
            this.setSalary(this.getSalary() + (this.getSalary() * amount / 200));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * amount / 100));
        }
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " is "
                + this.age + " years old." + this.getSalary() + "leva";
    }

}