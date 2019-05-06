package patterns.behavioral.visitor;

import patterns.behavioral.visitor.client.CityMap;
import patterns.behavioral.visitor.client.CitySights;
import patterns.behavioral.visitor.visitor.JpegVisitor;
import patterns.behavioral.visitor.visitor.PdfVisitor;

public class VisitorApp {

    public static void main(String[] args) {
        CityMap map = new CityMap();
        CitySights sights = new CitySights();

        map.accept(new PdfVisitor());
        sights.accept(new PdfVisitor());

        map.accept(new JpegVisitor());
        sights.accept(new JpegVisitor());

    }
}
