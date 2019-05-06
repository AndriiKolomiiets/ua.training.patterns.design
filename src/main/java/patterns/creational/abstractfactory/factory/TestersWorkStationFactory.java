package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.database.Database;
import patterns.creational.abstractfactory.database.PostgresDB;
import patterns.creational.abstractfactory.input.ConsoleInput;
import patterns.creational.abstractfactory.input.Input;
import patterns.creational.abstractfactory.output.ConsoleOutput;
import patterns.creational.abstractfactory.output.Output;

public class TestersWorkStationFactory implements WorkStationFactory {
    @Override
    public Database getDatabase() {
        return new PostgresDB();
    }

    @Override
    public Input getInput() {
        return new ConsoleInput();
    }

    @Override
    public Output getOutput() {
        return new ConsoleOutput();
    }
}
