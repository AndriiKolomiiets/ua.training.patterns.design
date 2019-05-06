package patterns.structural.decorator;

import patterns.structural.decorator.component.Printer;
import patterns.structural.decorator.component.PrinterImpl;
import patterns.structural.decorator.decorator.QuotesDecorator;

public class DecoratorApp {
    public static final String TEXT = "Document for printing.";
    public static void main(String[] args) {
        Printer printer = new PrinterImpl(TEXT);
        Printer printerViaDecorator = new QuotesDecorator(printer);

        printer.print();
        printerViaDecorator.print();
    }
}
