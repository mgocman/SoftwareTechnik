package Task2;

public class GoldMedalVisitor implements Visitor{
    @Override
    public void visit(Leaf leaf) {
        System.out.println("Team: "+leaf.name +", " + "Number of gold Medals: "+leaf.numOfMedals);
    }

    @Override
    public void visit(Composite composite) {
        System.out.println(composite.name);
        for(OlympicComponent node : composite.nodes) {
            node.accept(this);
        }
    }
}
