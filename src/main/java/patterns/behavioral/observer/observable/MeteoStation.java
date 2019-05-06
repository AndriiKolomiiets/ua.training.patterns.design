package patterns.behavioral.observer.observable;

import patterns.behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observable {
    private int temperature;
    private int pressure;
    private List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int temperature, int pressure) {
        this.pressure = pressure;
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.handleEvent(temperature, pressure);
        }
    }
}
