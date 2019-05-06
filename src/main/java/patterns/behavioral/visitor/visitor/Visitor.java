package patterns.behavioral.visitor.visitor;

import patterns.behavioral.visitor.client.CityMap;
import patterns.behavioral.visitor.client.CitySights;

/**
 * Visitor
 * */
public interface Visitor {
    void visit(CitySights engine);
    void visit(CityMap body);
}
