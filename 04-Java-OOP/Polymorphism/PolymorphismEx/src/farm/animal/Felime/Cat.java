package farm.animal.Felime;

import farm.animal.Food;

public class Cat extends Felime{

    private String breed;

    public Cat(String animalName, String animalType,
               Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");

    }


    @Override
    public void eat(Food food){
        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        String result = super.toString();
        String catOut = String.format(", %s", this.getBreed());
        return result.replaceFirst(",", catOut);

    }
}
