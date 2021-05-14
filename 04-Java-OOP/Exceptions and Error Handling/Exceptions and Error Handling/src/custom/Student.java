package custom;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) throws InvalidPersonNameException {
        this.setName(name);
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidPersonNameException {
        for (char symbol : name.toCharArray()) {
            if(!Character.isAlphabetic(symbol)){
                throw new InvalidPersonNameException("Student inavalid name " +name);
            }

        }

        this.name = name;
    }

}
