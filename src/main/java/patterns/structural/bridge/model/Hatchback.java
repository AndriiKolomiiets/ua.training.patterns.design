package patterns.structural.bridge.model;

public class Hatchback extends Car {
    public Hatchback(Brand brand) {
        super(brand);
    }

    @Override
    public void showDetails() {
        System.out.print("Hatchback - ");
        brand.setBrand();
    }
}
