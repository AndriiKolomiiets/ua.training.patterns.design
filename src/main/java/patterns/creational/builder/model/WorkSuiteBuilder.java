package patterns.creational.builder.model;

public class WorkSuiteBuilder {
    private Database db = Database.MYSQL;
    private String in = "Input from console...";
    private String out = "Output to Console...";

    public WorkSuiteBuilder buildDatabase(Database db) {
        this.db = db;
        return this;
    }

    public WorkSuiteBuilder buildInput(String in) {
        this.in = in;
        return this;
    }

    public WorkSuiteBuilder buildOutput(String out) {
        this.out = out;
        return this;
    }

    public WorkSuite build() {
        WorkSuite workSuite = new WorkSuite();
        workSuite.setDatabase(db);
        workSuite.setTypeOfInput(in);
        workSuite.setTypeOfOutput(out);
        return workSuite;
    }
}
