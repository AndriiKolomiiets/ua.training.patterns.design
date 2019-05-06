package patterns.structural.flyweight.flyweightfactory;

import patterns.structural.flyweight.flyweight.Circle;
import patterns.structural.flyweight.flyweight.Point;
import patterns.structural.flyweight.flyweight.Shape;
import patterns.structural.flyweight.flyweight.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight factory
 * */
public class ShapeFactory {
    private static final Map<String,Shape> shapes = new HashMap<>();
    public Shape getShape(String shapeName){
        Shape shape = shapes.get(shapeName);
        if (shape == null){
            switch (shapeName){
                case "circle": shape = new Circle();
                    break;
                case "square": shape = new Square();
                    break;
                case "point": shape = new Point();
                    break;
            }
            shapes.put(shapeName,shape);
        }
        return shape;
    }
}
