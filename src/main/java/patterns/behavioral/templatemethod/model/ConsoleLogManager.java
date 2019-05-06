package patterns.behavioral.templatemethod.model;

public class ConsoleLogManager extends LogManager {
    @Override
    public void printLog(String log) {
        System.out.println(log);
    }
}
