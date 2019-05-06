package patterns.structural.flyweight;

import patterns.structural.flyweight.flyweight.Circle;
import patterns.structural.flyweight.flyweight.Point;
import patterns.structural.flyweight.flyweight.Shape;
import patterns.structural.flyweight.flyweight.Square;
import patterns.structural.flyweight.flyweightfactory.ShapeFactory;

import java.util.*;

public class FlyWeightApp {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("point"));

        Random rand = new Random();
        for (Shape shape : shapes){
            int x = rand.nextInt(100);
            int y = rand.nextInt(500);
            shape.draw(x, y);
        }
        int numberOfPointClasses = Point.getCountOfClassInstances();
        int numberOfCircleClasses = Circle.getCountOfClassInstances();
        int numberOfSquareClasses = Square.getCountOfClassInstances();

        System.out.println("Point instances: " + numberOfPointClasses + "\nCircle instances: " + numberOfCircleClasses +
        "\nSquare instances: " + numberOfSquareClasses);
    }
}
