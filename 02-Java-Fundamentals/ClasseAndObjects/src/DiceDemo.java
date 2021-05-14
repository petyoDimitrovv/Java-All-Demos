import org.w3c.dom.ls.LSOutput;

public class DiceDemo {
    public static void main(String[] args) {

        Dice d1 = new Dice(6);

        System.out.println(d1.getSides());
        d1.setSides(6);
        System.out.println(d1.getSides());

        Dice d2= new Dice(20);
        System.out.println(d2.getSides());
        d2.setSides(3);
        System.out.println(d2.getSides());

        System.out.println(d1.getSides());
        System.out.println(d1.roll());
        System.out.println(d2.roll());
    }
}
