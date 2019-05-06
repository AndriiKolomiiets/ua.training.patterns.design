package patterns.creational.abstractfactory.output;

public class ConsoleOutput implements Output {
    @Override
    public void printText(String s) {
        System.out.println("Print to console: " + s);
    }
}
