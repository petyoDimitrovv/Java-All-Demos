package app.interfaces;

import app.enums.ReportLevel;

public interface Layout {

    String format(String date, ReportLevel reportlevel , String message);
}
