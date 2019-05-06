package patterns.structural.composite.composite;

import patterns.structural.composite.component.Shape;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
    public List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        this.components.add(component);
    }

    public void removeComponent(Shape component) {
        this.components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape component : components){
            component.draw();
        }

    }
}
