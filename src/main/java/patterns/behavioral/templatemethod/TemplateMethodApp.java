package patterns.behavioral.templatemethod;

import patterns.behavioral.templatemethod.model.ConsoleLogManager;
import patterns.behavioral.templatemethod.model.FileLogManager;
import patterns.behavioral.templatemethod.model.LogManager;

public class TemplateMethodApp {
    public static final String DATA = ">>This sentence contains pretty important data";

    public static void main(String[] args) {
        LogManager consoleLogManager = new ConsoleLogManager();
        LogManager fileLogManager = new FileLogManager();
        consoleLogManager.templateMethod(DATA);
        fileLogManager.templateMethod(DATA);
    }
}
