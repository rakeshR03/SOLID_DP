package designpattern.structural.decorator.example2;

public class Client {
    public static void main(String[] args) {
        Sundae sundae = new ChocoScoop(new VanillaScoop(new ChocoWafer(new Cone())));
        System.out.println(sundae.getPrice());
        sundae.getComposition();
    }
}
