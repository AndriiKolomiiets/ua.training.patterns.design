package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.database.Database;
import patterns.creational.abstractfactory.database.MySqlDB;
import patterns.creational.abstractfactory.input.Input;
import patterns.creational.abstractfactory.input.UrlInput;
import patterns.creational.abstractfactory.output.FileOutput;
import patterns.creational.abstractfactory.output.Output;

public class ProductionWorkStationFactory implements WorkStationFactory {
    @Override
    public Database getDatabase() {
        return new MySqlDB();
    }

    @Override
    public Input getInput() {
        return new UrlInput();
    }

    @Override
    public Output getOutput() {
        return new FileOutput();
    }
}
