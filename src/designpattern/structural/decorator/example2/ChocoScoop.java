package designpattern.structural.decorator.example2;

public class ChocoScoop implements Sundae{
    private Sundae sundae;
    ChocoScoop(Sundae sundae){
        this.sundae = sundae;
    }
    @Override
    public int getPrice() {
        return this.sundae.getPrice() + ItemPrice.chocoScoop;
    }

    @Override
    public void getComposition() {
        this.sundae.getComposition();
        System.out.println("ChocoScoop");
    }
}
