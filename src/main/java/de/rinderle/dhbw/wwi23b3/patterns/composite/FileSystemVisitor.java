package de.rinderle.dhbw.wwi23b3.patterns.composite;

// Implementierung der Methoden, welche für die besuchbaren Klassen gelten
public interface FileSystemVisitor {
    void visit (CustomFile file);
    void visit(CustomDirectory directory);
}
