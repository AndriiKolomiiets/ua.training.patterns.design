package patterns.structural.composite.component;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("This is square.");
    }
}
