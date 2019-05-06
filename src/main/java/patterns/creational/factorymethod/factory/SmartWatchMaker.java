package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.watches.Watch;
import patterns.creational.factorymethod.watches.SmartWatch;

public class SmartWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new SmartWatch();
    }
}
