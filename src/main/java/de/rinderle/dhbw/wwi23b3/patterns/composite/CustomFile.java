package de.rinderle.dhbw.wwi23b3.patterns.composite;

public class CustomFile implements FileSystemComponent {
    private String name;
    private int size;

    public CustomFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}