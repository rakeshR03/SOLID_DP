package designpattern.structural.decorator.example2;

public class VanillaScoop implements Sundae{
    private Sundae sundae;
    VanillaScoop(Sundae sundae){
        this.sundae = sundae;
    }
    @Override
    public int getPrice() {
        return this.sundae.getPrice() + ItemPrice.vanillaScoop;
    }

    @Override
    public void getComposition() {
        this.sundae.getComposition();
        System.out.println("VanillaScoop");
    }
}
