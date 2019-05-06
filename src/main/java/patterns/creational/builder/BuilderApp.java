package patterns.creational.builder;

import patterns.creational.builder.model.Database;
import patterns.creational.builder.model.WorkSuite;
import patterns.creational.builder.model.WorkSuiteBuilder;

public class BuilderApp {
    public static String CONSOLE = "console";
    public static String LOG = "log";
    public static String FILE = "file";

    public static void main(String[] args) {
        WorkSuite suite= new WorkSuiteBuilder().
                buildDatabase(Database.POSTGRES).
                buildInput(FILE).
                buildOutput(LOG).
                build();
        System.out.println(suite);
    }
}
