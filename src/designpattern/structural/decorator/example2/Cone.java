package designpattern.structural.decorator.example2;

public class Cone implements Sundae{
    private Sundae sundae;

    Cone(){};

    @Override
    public int getPrice() {
        return ItemPrice.cone;
    }

    @Override
    public void getComposition() {
        System.out.println("Cone");
    }
}
