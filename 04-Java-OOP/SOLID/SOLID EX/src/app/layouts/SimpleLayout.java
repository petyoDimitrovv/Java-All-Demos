package app.layouts;

import app.enums.ReportLevel;

public class SimpleLayout implements Layout {
    @Override
    public String format(String dateTime, ReportLevel reportlevel, String message) {
        return String.format("%s - %s - %s", dateTime, reportlevel.toString(), message);


    }
}
