package patterns.creational.factorymethod;

import patterns.creational.factorymethod.factory.AnalogueWatchMaker;
import patterns.creational.factorymethod.factory.DigitalWatchMaker;
import patterns.creational.factorymethod.factory.SmartWatchMaker;
import patterns.creational.factorymethod.factory.WatchMaker;
import patterns.creational.factorymethod.watches.Watch;

/**
 * Factory method pattern.
 * This pattern define interface to create an object, but delegate to subclasses class creation.
 * */
public class FactoryMethodApp {
    public static final String DIGITAL = "digital";
    public static final String ANALOGUE = "analogue";
    public static final String SMART = "smart";
    public static void main(String[] args) throws IllegalAccessException {
        WatchMaker watchMaker = getMakerByWatchType(DIGITAL);
        Watch customerWatch = watchMaker.createWatch();
        customerWatch.showTime();
    }

    private static WatchMaker getMakerByWatchType(String watchType) throws IllegalAccessException {
        if(watchType == DIGITAL){
            return new DigitalWatchMaker();
        }else if (watchType==ANALOGUE){
            return new AnalogueWatchMaker();
        }else if(watchType==SMART){
            return new SmartWatchMaker();
        }else {
            throw new IllegalAccessException("Current watch line isn't producing: "+ watchType);
        }
    }


}
