package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.database.Database;
import patterns.creational.abstractfactory.input.Input;
import patterns.creational.abstractfactory.output.Output;

public interface WorkStationFactory {
    Database getDatabase();
    Input getInput();
    Output getOutput();
}
