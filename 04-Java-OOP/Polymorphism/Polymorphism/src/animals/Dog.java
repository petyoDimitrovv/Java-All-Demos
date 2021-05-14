package animals;

public class Dog extends Animals{
    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }
    @Override
    public String explainSelf(){
        return super.explainSelf() + System.lineSeparator() + "DJAAF";


    }
}
