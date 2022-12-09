package Task2;

import java.util.HashSet;

public class Composite extends Node implements OlympicComponent{

    HashSet<OlympicComponent> nodes = new HashSet<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(OlympicComponent olympicComponent) {
        nodes.add(olympicComponent);
    }

    public void remove(OlympicComponent olympicComponent) {
        nodes.remove(olympicComponent);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
