package Task2;

public class Leaf extends Node implements OlympicComponent{

    public Leaf(String name, int numOfAthlete, int numOfMedals) {
        this.name = name;
        this.numOfAthletes = numOfAthlete;
        this.numOfMedals = numOfMedals;
    }


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
