package Demo;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    HUIDAY (8);

    public int getDayAsNumber() {
        return dayAsNumber;
    }

    private int dayAsNumber;

     DayOfWeek(int dayAsNumber){
         this.dayAsNumber = dayAsNumber;

    }



}
