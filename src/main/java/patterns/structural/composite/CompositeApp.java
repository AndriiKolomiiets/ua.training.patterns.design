package patterns.structural.composite;

import patterns.structural.composite.component.Circle;
import patterns.structural.composite.component.Shape;
import patterns.structural.composite.component.Square;
import patterns.structural.composite.component.Triangle;
import patterns.structural.composite.composite.Composite;

/**
 * */
public class CompositeApp {

    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape triangle1 = new Triangle();

        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape triangle2 = new Triangle();
        Shape square3 = new Square();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite = new Composite();

        composite1.addComponent(square1);
        composite1.addComponent(square2);
        composite1.addComponent(triangle1);

        composite2.addComponent(circle1);
        composite2.addComponent(circle2);
        composite2.addComponent(triangle2);

        composite.addComponent(square3);
        composite.addComponent(composite1);
        composite.addComponent(composite2);

        composite.draw();
    }
}
