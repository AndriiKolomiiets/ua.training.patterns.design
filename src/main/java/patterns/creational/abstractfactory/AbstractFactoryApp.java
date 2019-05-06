package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.database.Database;
import patterns.creational.abstractfactory.factory.LogWorkStationFactory;
import patterns.creational.abstractfactory.factory.ProductionWorkStationFactory;
import patterns.creational.abstractfactory.factory.TestersWorkStationFactory;
import patterns.creational.abstractfactory.factory.WorkStationFactory;
import patterns.creational.abstractfactory.input.Input;
import patterns.creational.abstractfactory.output.Output;

public class AbstractFactoryApp {
    private static String TESTING = "test";
    private static String LOGGING = "log";
    private static String PRODUCTION = "prod";

    public static void main(String[] args) throws IllegalAccessException {
        WorkStationFactory workStationFactory = getWorkStationFactoryByPurpose(TESTING);
//        WorkStationFactory workStationFactory = getWorkStationFactoryByPurpose(LOGGING);
//        WorkStationFactory workStationFactory = getWorkStationFactoryByPurpose(PRODUCTION);
        Database database = workStationFactory.getDatabase();
        Input input = workStationFactory.getInput();
        Output output = workStationFactory.getOutput();
        database.putData(input.readText());
        output.printText(database.getData());
    }

    private static WorkStationFactory getWorkStationFactoryByPurpose(String purpose) throws IllegalAccessException {
        if (purpose.equals(PRODUCTION)) {
            return new ProductionWorkStationFactory();
        } else if (purpose.equals(LOGGING)) {
            return new LogWorkStationFactory();
        } else if (purpose.equals(TESTING)) {
            return new TestersWorkStationFactory();
        }
        throw new IllegalAccessException("Wrong purpose: " + purpose);
    }
}
