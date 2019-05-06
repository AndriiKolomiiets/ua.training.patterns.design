package patterns.structural.bridge.model;

public class Audi implements Brand {
    @Override
    public void setBrand() {
        System.out.println("Volkswagen Audi Group");
    }
}
