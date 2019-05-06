package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.database.Database;
import patterns.creational.abstractfactory.database.NoSqlDB;
import patterns.creational.abstractfactory.input.FileInput;
import patterns.creational.abstractfactory.input.Input;
import patterns.creational.abstractfactory.output.LogOutput;
import patterns.creational.abstractfactory.output.Output;

public class LogWorkStationFactory implements WorkStationFactory {
    @Override
    public Database getDatabase() {
        return new NoSqlDB();
    }

    @Override
    public Input getInput() {
        return new FileInput();
    }

    @Override
    public Output getOutput() {
        return new LogOutput();
    }
}
