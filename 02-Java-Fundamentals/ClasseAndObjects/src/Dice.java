import java.util.Random;

public class Dice {
    private int sides;

    public Dice(int sides){
        this.sides = sides;
    }

    public int getSides() {
        return this.sides;
    }
    public void setSides(int newSide){

        this.sides = newSide;
    }
    public int roll(){
        int result = this.getRandomSide();
        return result;
    }

    private int getRandomSide() {
        Random rnd = new Random();
       return rnd.nextInt(this.sides) + 1;
    }
}

