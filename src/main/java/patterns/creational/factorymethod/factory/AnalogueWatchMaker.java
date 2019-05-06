package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.watches.Watch;
import patterns.creational.factorymethod.watches.AnalogWatch;

public class AnalogueWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new AnalogWatch();
    }
}
