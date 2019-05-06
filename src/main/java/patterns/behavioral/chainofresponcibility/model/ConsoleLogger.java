package patterns.behavioral.chainofresponcibility.model;

public class ConsoleLogger implements Logger {
    private int level;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    private Logger nextLogger;

    public ConsoleLogger(int priority) {
        this.level = priority;
    }

    @Override
    public void writeMessage(String message, int priorityLevel) {
        if (priorityLevel <= level) {
            System.out.println("Console log: " + message);
        }
        if (nextLogger != null) {
            nextLogger.writeMessage(message, priorityLevel);
        }
    }
}
