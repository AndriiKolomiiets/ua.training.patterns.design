package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.watches.Watch;
import patterns.creational.factorymethod.watches.DigitalWatch;

public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
