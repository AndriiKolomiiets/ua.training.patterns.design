package patterns.creational.builder.model;

public class WorkSuite {
    private Database database;
    private String typeOfInput;
    private String typeOfOutput;

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void setTypeOfInput(String typeOfInput) {
        this.typeOfInput = typeOfInput;
    }

    public void setTypeOfOutput(String typeOfOutput) {
        this.typeOfOutput = typeOfOutput;
    }
@Override
    public String toString(){
        return "Work Suite with components:\n" +
                "Database: " + database +
                "\nInput type: " + typeOfInput +
                "\nOutput type: " + typeOfOutput;
}

}
