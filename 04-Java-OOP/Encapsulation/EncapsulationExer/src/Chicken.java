public class Chicken {

    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age > 15) {
            throw new IllegalStateException("Age should be between 0 and 15");
        }
        this.age = age;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalStateException("Name cannot be empty");
        }
        this.name = name;


    }

    public int getAge() {
        return age;
    }

    public double productPerDay() {
        return this.calculateProductPerDay();

    }
    private double calculateProductPerDay() {
        if (getAge() >= 0 && getAge() <= 5) {
            return  2;
        } else if (getAge() >= 6 && getAge() <= 11) {
            return  1;
        } else {
            setAge(age);
            return  0.75;
        }


    }

    @Override
    public String toString() {
        return "Chicken " + this.name + " ( age "
                + this.age + " ) can produce " + this.productPerDay() +
                " eggs per day." ;
    }
}

