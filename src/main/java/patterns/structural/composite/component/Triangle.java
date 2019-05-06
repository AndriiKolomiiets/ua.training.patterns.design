package patterns.structural.composite.component;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is triangle.");
    }
}
