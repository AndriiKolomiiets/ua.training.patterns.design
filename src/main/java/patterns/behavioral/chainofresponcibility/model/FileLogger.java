package patterns.behavioral.chainofresponcibility.model;

public class FileLogger implements Logger {
    private int level;
    private Logger nextLogger;

    public FileLogger(int priority){
        this.level = priority;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void writeMessage(String message, int priorityLevel) {
        if (priorityLevel<=level){
            System.out.println("File log: " + message);
        }
        if (nextLogger!=null){
            nextLogger.writeMessage(message, priorityLevel);
        }
    }
}
