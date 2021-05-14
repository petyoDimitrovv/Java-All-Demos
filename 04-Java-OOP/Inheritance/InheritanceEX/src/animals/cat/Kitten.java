package animals.cat;

public class Kitten extends Cat{
    public Kitten(String name, int age) {
        super(name, age, "Female");
    }

    @Override
    protected String produceSound() {
        return "meow";
    }
}
