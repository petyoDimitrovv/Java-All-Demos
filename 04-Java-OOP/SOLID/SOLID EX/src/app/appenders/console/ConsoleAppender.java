package app.appenders.console;

import app.appenders.Appender;
import app.appenders.BaseAppender;
import app.enums.ReportLevel;
import app.layouts.Layout;

public class ConsoleAppender extends BaseAppender  {
    public ConsoleAppender(Layout layout) {
        super(layout);
    }



    @Override
    public void append(String dateTime, ReportLevel reportLevel, String message) {
        if (super.chekIfReportLevelIsValid(reportLevel)) {
            System.out.println(super.getLayout().format(dateTime, reportLevel, message));
            super.setMessagesAppended(super.getMessagesAppended()+ 1);
        }
    }

    @Override
    public String toString() {
return super.toString();    }
}
