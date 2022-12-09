package Task2;

public class AthletesVisitor implements Visitor{
    @Override
    public void visit(Leaf leaf) {
        System.out.println("Team: "+leaf.name +", " + "Number of Athletes: "+leaf.numOfAthletes);
    }

    @Override
    public void visit(Composite composite) {
        System.out.println(composite.name);
        for(OlympicComponent node : composite.nodes) {
            node.accept(this);
        }
    }
}
