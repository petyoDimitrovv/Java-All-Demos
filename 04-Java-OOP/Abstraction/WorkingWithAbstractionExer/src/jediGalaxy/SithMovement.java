package jediGalaxy;

public class SithMovement implements Movement{
    @Override

    public long move(int row, int col, Field field) {
        while (row >= 0 && col >= 0) {
            if (field.isInBounds(row, col)) {
                field.setValue(row, col, 0);
            }
            row--;
            col--;
        }
        return 0;
    }
}
