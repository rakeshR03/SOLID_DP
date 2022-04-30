package designpattern.structural.decorator.example1;

public class ChocoScoop implements Cone{

    private Cone cone;

    ChocoScoop(Cone cone){
        this.cone = cone;
    }

    @Override
    public int getPrice() {
        return cone.getPrice() + ItemPrice.chocoScoop;
    }

    @Override
    public void getComposition() {
        cone.getComposition();
        System.out.println("chocoScoop");
    }
}
