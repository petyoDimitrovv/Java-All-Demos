package jediGalaxy;

public class JediMovement implements Movement{
    @Override

    public long move(int rowJedi, int colJedi, Field field) {
        long starPowerCollected = 0;
        while (rowJedi >= 0 && colJedi < field.getColLenght(1)) {

            if (field.isInBounds(rowJedi, colJedi)) {
                starPowerCollected += field.getValue(rowJedi,colJedi);

            }
            rowJedi--;
            colJedi++;
        }
        return starPowerCollected;

    }
}
