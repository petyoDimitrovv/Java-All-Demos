package animals.cat;

public class Tomcat extends Cat {
    public Tomcat(String name, int age) {

        super(name, age, "Male");
    }

    @Override
    protected String produceSound() {
        return "MEOW";
    }
}
