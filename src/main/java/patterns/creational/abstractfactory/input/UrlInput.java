package patterns.creational.abstractfactory.input;

public class UrlInput implements Input {
    @Override
    public String readText() {
        return "This text was read from the URL.";
    }
}
