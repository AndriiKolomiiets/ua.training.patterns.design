package patterns.behavioral.visitor.client;

import patterns.behavioral.visitor.visitor.Visitor;

public class CityMap implements Element {
    public static final String MAP = "Here is supposed to be a map of the city.\n+++++++\n=======\n+++++++";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "City map: " + MAP + "\n";
    }
}
