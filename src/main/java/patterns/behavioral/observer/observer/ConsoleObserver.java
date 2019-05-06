package patterns.behavioral.observer.observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println("The weather has changed.\nTemperature: " + temp + "; pressure: " + pressure);
    }
}
