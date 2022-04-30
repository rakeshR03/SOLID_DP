package designpattern.structural.decorator.example2;

public class ChocoWafer implements Sundae{

    private Sundae sundae;

    ChocoWafer(){};

    ChocoWafer(Sundae sundae){
        this.sundae = sundae;
    }

    @Override
    public int getPrice() {
        int cost = ItemPrice.chocoWafer;
        if(this.sundae == null){
            return cost;
        }
        return this.sundae.getPrice() + cost;
    }

    @Override
    public void getComposition() {
        if(this.sundae != null){
            this.sundae.getComposition();
        }
        System.out.println("ChocoWafer");
    }
}
