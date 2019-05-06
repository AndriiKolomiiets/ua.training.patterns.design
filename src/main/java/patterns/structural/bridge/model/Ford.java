package patterns.structural.bridge.model;

public class Ford implements Brand {
    @Override
    public void setBrand() {
        System.out.println("Ford Motor Company");
    }
}
