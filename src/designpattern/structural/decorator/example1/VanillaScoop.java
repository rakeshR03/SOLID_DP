package designpattern.structural.decorator.example1;

public class VanillaScoop implements Cone{

    private Cone cone;

    VanillaScoop(Cone cone){
        this.cone = cone;
    }

    @Override
    public int getPrice() {
        return this.cone.getPrice() + ItemPrice.vanillaScoop;
    }

    @Override
    public void getComposition() {
        this.cone.getComposition();
        System.out.println("vanillaScoop");
    }
}
