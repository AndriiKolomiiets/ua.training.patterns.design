package patterns.structural.bridge.model;

public class Sedan extends Car {
    public Sedan(Brand brand) {
        super(brand);
    }

    @Override
    public void showDetails() {
        System.out.print("Sedan - ");
        brand.setBrand();
    }
}
