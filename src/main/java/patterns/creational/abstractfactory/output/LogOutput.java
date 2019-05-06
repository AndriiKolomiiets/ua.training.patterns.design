package patterns.creational.abstractfactory.output;

public class LogOutput implements Output {
    @Override
    public void printText(String s) {
        System.out.println("Print to log: " + s);
    }
}
