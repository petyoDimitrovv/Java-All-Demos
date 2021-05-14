package jediGalaxy;

public class Galaxy {
    public Field field;
    private Movement second;
    private Movement first;

    public Galaxy(Field field, Movement first, Movement second){
        this.field = field;
        this.first = first;
        this. second = second;
    }

    public void moveSith(int row, int col) {
        this.first.move(row,col, this.field);

    }

    public long moveJedi(int rowJedi, int colJedi) {
        return this. second.move(rowJedi, colJedi, this.field);
    }
}
