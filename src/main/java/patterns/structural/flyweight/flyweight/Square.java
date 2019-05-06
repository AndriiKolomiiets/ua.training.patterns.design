package patterns.structural.flyweight.flyweight;

public class Square implements Shape {
    private static int countOfClassInstances;
    public Square(){
        countOfClassInstances++;
    }

    int a = 15;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw a square with a flank " + a +".");
    }
    public static int getCountOfClassInstances() {
        return countOfClassInstances;
    }
}
