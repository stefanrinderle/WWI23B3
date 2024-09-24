package de.rinderle.dhbw.wwi23b3.patterns.composite;

public interface Visitor {
   
    void visit(CustomDirectory dir);

    void visit(CustomFile file);

}
