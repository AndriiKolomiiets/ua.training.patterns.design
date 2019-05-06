package patterns.creational.abstractfactory.input;

public class FileInput implements Input {
    @Override
    public String readText() {
        return "This text was read from the file.";
    }
}
