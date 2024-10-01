package de.rinderle.dhbw.wwi23b3.patterns.composite;

public class SizeVisitor implements Visitor {


        int sumSize= 0;

    @Override
    public void visit(CustomDirectory dir) {
        sumSize+= dir.getSize();
    }

    @Override
    public void visit(CustomFile file) {
    sumSize+=file.getSize();
    }

    public int getSumSize() {
        return sumSize;
    }
}
