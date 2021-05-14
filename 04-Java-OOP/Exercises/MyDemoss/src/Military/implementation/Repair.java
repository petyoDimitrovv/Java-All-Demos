package Military.implementation;

import Military.interfaces.Private;

public class Repair {
    private String name;
    private int hourWorked;

    public Repair(String name, int hourWorked) {
        this.name = name;
        this.hourWorked = hourWorked;
    }

    public String getName() {
        return name;
    }

    public int getHourWorked() {
        return hourWorked;
    }
}
