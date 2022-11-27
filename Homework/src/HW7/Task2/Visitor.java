package HW7.Task2;

public interface Visitor {

    void visit(Leaf leaf);
    void visit(Composite composite);
}
