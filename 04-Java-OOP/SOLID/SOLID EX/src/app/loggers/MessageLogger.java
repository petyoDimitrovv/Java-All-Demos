package app.loggers;

import app.appenders.Appender;
import app.enums.ReportLevel;

import java.util.ArrayList;
import java.util.List;

public class MessageLogger implements Logger{

    private List<Appender> appenders;

    public MessageLogger(Appender... appender) {
        this.appenders = new ArrayList<>(List.of(appender));
    }

    public List<Appender> getAppenders() {
        return appenders;
    }

    @Override
    public void logInfo(String dateTime, String message) {
        this.appenders.forEach(a -> a.append(dateTime, ReportLevel.INFO, message));
    }

    @Override
    public void logWarning(String dateTime, String message) {
        this.appenders.forEach(a -> a.append(dateTime, ReportLevel.WARNING, message));

    }

    @Override
    public void logError(String dateTime, String message) {
        this.appenders.forEach(a -> a.append(dateTime, ReportLevel.ERROR, message));
    }

    @Override
    public void logCritical(String dateTime, String message) {
        this.appenders.forEach(a -> a.append(dateTime, ReportLevel.CRITICAL, message));

    }

    @Override
    public void logFatal(String dateTime, String message) {
        this.appenders.forEach(a -> a.append(dateTime, ReportLevel.FATAL, message));

    }

    @Override
    public String logInfo() {
        StringBuilder sb = new StringBuilder()
                .append("Logger info")
                .append(System.lineSeparator());

        for (Appender appender : appenders) {

        sb.append(appender.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }

}
