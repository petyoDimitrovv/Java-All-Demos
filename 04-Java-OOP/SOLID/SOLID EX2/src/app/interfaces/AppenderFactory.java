package app.interfaces;

public interface AppenderFactory {
    Appender produce(String type, Layout layout);
}
