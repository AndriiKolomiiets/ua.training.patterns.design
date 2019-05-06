package patterns.creational.abstractfactory.output;

public class FileOutput implements Output {
    @Override
    public void printText(String s) {
        System.out.println("Print to file: " + s);
    }
}
