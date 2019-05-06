package patterns.behavioral.visitor.visitor;

import patterns.behavioral.visitor.client.CityMap;
import patterns.behavioral.visitor.client.CitySights;

public class PdfVisitor implements Visitor {
    @Override
    public void visit(CitySights sights) {
        System.out.println("Forming " + CitySights.class.getSimpleName() + ".pdf file. Wait a second...");
        System.out.println(sights);
    }

    @Override
    public void visit(CityMap map) {
        System.out.println("Forming " + CityMap.class.getSimpleName() + ".pdf file. Wait a second...");
        System.out.println(map);
    }
}
