package designpattern.structural.decorator.example1;

public class ChocolateWafer implements Cone{

    private Cone cone;

    ChocolateWafer(){};

    ChocolateWafer(Cone cone){
        if(cone == null ){
            throw new RuntimeException();
        }
        this.cone = cone;
    }
    @Override
    public int getPrice() {
        int cost = ItemPrice.chocolateWafer;
        if(cone == null){
            return cost;
        }
        return this.cone.getPrice() + cost;
    }

    @Override
    public void getComposition() {
        if(cone != null){
            this.cone.getComposition();
        }

        System.out.println("ChocoWafer");
    }
}
