package patterns.structural.flyweight.flyweight;

public class Circle implements Shape {
    private static int countOfClassInstances;
    public Circle(){
        countOfClassInstances++;
    }

    int r = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw a circle with a radius: " + r +".");
    }
    public static int getCountOfClassInstances() {
        return countOfClassInstances;
    }
}
