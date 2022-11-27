package HW7.Task1;

public class CostVisitor implements Visitor{

    @Override
    public void visitElectronic(Electronic electronic) {
        double costPerKilo = 0;
        if (electronic.getFragile()){
            costPerKilo = 5.0/10.0;
        } else {
            costPerKilo = 5.0/15.0;
        }
        System.out.println("Total Cost for " + electronic.getName() + " is: " + electronic.getWeight() * costPerKilo);
    }

    @Override
    public void visitGlass(Glass glass) {
        double costPerMeter = 0;
        if (glass.getTickness() == 1){
            costPerMeter = 2.0;
        } else if (glass.getTickness() == 2){
            costPerMeter = 1.2;
        } else {
            costPerMeter = 0.7;
        }
        System.out.println("Total Cost for " + glass.getName() + " is: " + ((double)glass.getLenght()/100.00) * costPerMeter);

    }

    @Override
    public void visitFurniture(Furniture furniture) {
        double costPerKilo = 5.0/20.0;
        System.out.println("Total Cost for " + furniture.getName() + " is: " + furniture.getWeight() * costPerKilo);
    }

}
