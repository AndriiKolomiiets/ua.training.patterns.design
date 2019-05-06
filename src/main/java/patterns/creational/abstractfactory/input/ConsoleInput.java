package patterns.creational.abstractfactory.input;

public class ConsoleInput implements Input {
    @Override
    public String readText() {
        return "This text was read from the console.";
    }
}
