package patterns.behavioral.visitor.client;

import patterns.behavioral.visitor.visitor.Visitor;

/**
 * Element
 * */
public interface Element {
    void accept(Visitor visitor);
}
