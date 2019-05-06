package patterns.behavioral.visitor.client;

import patterns.behavioral.visitor.visitor.Visitor;

public class CitySights implements Element{
    public static final String MAIN_SQUARE = "Central Square";
    public static final String MAIN_STREET = "Central Street";
    public static final String VIEW = "High Hills";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString(){
        return ">> City sights: " +
                "\nMain square: " + MAIN_SQUARE +
                "\nMain street: " + MAIN_STREET +
                "\nMost beautiful view: " + VIEW + "\n";
    }
}
