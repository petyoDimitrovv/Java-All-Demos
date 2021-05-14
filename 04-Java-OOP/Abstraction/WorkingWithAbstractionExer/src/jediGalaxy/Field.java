package jediGalaxy;

public class Field {
    private int[][] matrix;


    public Field(int rows, int cols) {
        this(rows, cols, 0);

    }
    public Field(int rows, int cols, int beginFillValue) {
        this.matrix = new int[rows][cols];
        this.fillValues(beginFillValue);
}

    private void fillValues(int beginValue) {
        for (int row = 0; row < this.matrix.length; row++) {
            for (int col = 0; col < this.matrix[row].length; col++) {
                this.matrix[row][col] = beginValue ++;
            }
        }

    }

    public boolean isInBounds(int row, int col) {
        return row < matrix.length && row >= 0
                && col >=0 && col <matrix[row].length;
    }

    public void setValue(int row, int col, int newValue) {
        this.matrix[row][col] = newValue;
    }

    public int getColLenght(int row) {
        return this.matrix[row].length;
    }

    public int getValue(int rowJedi, int colJedi) {
        return this.matrix[rowJedi][colJedi];
    }
}

