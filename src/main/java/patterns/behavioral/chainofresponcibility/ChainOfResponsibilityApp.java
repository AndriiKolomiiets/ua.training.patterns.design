package patterns.behavioral.chainofresponcibility;

import patterns.behavioral.chainofresponcibility.model.ConsoleLogger;
import patterns.behavioral.chainofresponcibility.model.FileLogger;
import patterns.behavioral.chainofresponcibility.model.LogLevel;
import patterns.behavioral.chainofresponcibility.model.MailLogger;

public class ChainOfResponsibilityApp {
    public static final String ERROR_TEST_MESSAGE = "Logging test message. >>ERROR";
    public static final String DEBUG_TEST_MESSAGE = "Logging test message >>Debugging";
    public static final String INFO_TEST_MESSAGE = "Logging test message >>Info";

    public static void main(String[] args) {
        MailLogger mailLogger = new MailLogger(LogLevel.ERROR);
        ConsoleLogger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
        FileLogger fileLogger = new FileLogger(LogLevel.INFO);

        mailLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(fileLogger);

        consoleLogger.writeMessage(DEBUG_TEST_MESSAGE, 2);
        System.out.println("==================================");
        fileLogger.writeMessage(INFO_TEST_MESSAGE, 3);
        System.out.println("==================================");
        mailLogger.writeMessage(ERROR_TEST_MESSAGE, 1);
    }
}
