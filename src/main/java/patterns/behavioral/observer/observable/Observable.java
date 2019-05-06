package patterns.behavioral.observer.observable;

import patterns.behavioral.observer.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
