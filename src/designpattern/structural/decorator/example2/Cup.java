package designpattern.structural.decorator.example2;

public class Cup implements Sundae{

    private Sundae sundae;
    Cup(){};
    @Override
    public int getPrice() {
        return ItemPrice.cup;
    }

    @Override
    public void getComposition() {
        System.out.println("Cup");
    }
}
