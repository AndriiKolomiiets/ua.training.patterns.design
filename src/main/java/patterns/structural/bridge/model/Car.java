package patterns.structural.bridge.model;

public abstract class Car {
    public Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

    public abstract void showDetails();
}
