package app.Controlers;

import app.enums.ReportLevel;
import app.interfaces.Layout;

public class SimpleLayout implements Layout {
    @Override
    public String format(String date, ReportLevel reportlevel, String message) {
        return String.format("<%s> - <%s> - <%s>", date, reportlevel.toString(), message);
    }
}
