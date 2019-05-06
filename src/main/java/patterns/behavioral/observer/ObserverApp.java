package patterns.behavioral.observer;

import patterns.behavioral.observer.observer.ConsoleObserver;
import patterns.behavioral.observer.observer.FileObserver;
import patterns.behavioral.observer.observable.MeteoStation;

public class ObserverApp {

    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());
        station.addObserver(new FileObserver());

        station.setMeasurements(22, 720);
        station.setMeasurements(22, 720);
    }
}
