package patterns.structural.decorator.decorator;

import patterns.structural.decorator.component.Printer;

public class QuotesDecorator implements Printer {
    Printer component;

    public QuotesDecorator(Printer component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
        System.out.println("Plus some additional functionality...");
    }
}
