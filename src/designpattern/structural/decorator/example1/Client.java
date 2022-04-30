package designpattern.structural.decorator.example1;

public class Client {
    public static void main(String[] args) {
        Cone cone = new ChocoScoop(new VanillaScoop(new ChocolateWafer()));
        System.out.println(cone.getPrice());
        cone.getComposition();
    }
}
