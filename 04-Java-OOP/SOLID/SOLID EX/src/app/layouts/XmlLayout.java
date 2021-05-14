package app.layouts;

import app.enums.ReportLevel;

public class XmlLayout implements  Layout{
    @Override
    public String format(String dateTime, ReportLevel reportlevel, String message) {
        return "<log>\n"
                + "     <date>" + dateTime + "</date>\n"
                + "     <level>" + reportlevel + "</level>\n"
                + "     <message>" + message + "</message>\n"
                + "</log>\n";
    }
}
