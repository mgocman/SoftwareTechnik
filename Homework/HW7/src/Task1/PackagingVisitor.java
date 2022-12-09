package Task1;

public class PackagingVisitor implements Visitor{


    @Override
    public void visitElectronic(Electronic electronic) {
        System.out.println(electronic.getName() + ":\n" + " >should be covered with Polyethylene foam film and packed in " +
                "a box with dimensions of "
        + (electronic.getWidth() +1) + "x" + (electronic.getLenght()+1) + "x" + (electronic.getHeight()+1));
    }

    @Override
    public void visitGlass(Glass glass) {
        System.out.println(glass.getName() + ":\n" + " >should be filled with Bubble wraps and packed in a box with dimensions of "
                + (glass.getHeight()+1) + "x" + (glass.getWidth()+1) + "x" + (glass.getLenght()+1));
    }

    @Override
    public void visitFurniture(Furniture furniture) {
        System.out.println(furniture.getName() + ":\n" + " >should be covered with waterproof covers with an area of "
        + furniture.getLenght() + "x" + furniture.getWidth());

    }

}
