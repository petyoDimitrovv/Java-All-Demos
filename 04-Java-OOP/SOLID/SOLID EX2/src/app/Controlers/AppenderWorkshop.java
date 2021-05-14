package app.Controlers;

import app.interfaces.Appender;
import app.interfaces.AppenderFactory;
import app.interfaces.Layout;

public class AppenderWorkshop implements AppenderFactory {
    @Override
    public Appender produce(String type, Layout layout) {
       return switch (type){
           case "ConsoleAppender" -> new ConsoleAppender(layout);
           default -> throw new IllegalStateException("Invalid appender type");
       };

    }
}
