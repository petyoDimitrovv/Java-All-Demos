package app;

import app.Controlers.ConsoleAppender;
import app.Controlers.MessageLogger;
import app.Controlers.SimpleLayout;
import app.interfaces.Appender;
import app.interfaces.Layout;
import app.interfaces.Logger;

public class Main {
    public static void main(String[] args) {

        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");

        //TODO....
    }
}
