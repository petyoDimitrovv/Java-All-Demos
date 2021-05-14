package app.interfaces;

import app.enums.ReportLevel;

public interface Appender {

    void append(String date, ReportLevel reportLevel, String message);
}
