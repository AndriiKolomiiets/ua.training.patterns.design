package patterns.structural.flyweight.flyweight;

public class Point implements Shape {
    private static int countOfClassInstances;
    public Point(){
        countOfClassInstances++;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw a point.");
    }

    public static int getCountOfClassInstances() {
        return countOfClassInstances;
    }
}
