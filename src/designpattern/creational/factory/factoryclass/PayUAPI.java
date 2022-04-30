package designpattern.creational.factory.factoryclass;

public class PayUAPI implements PaymentAPI{

    @Override
    public void pay() {
        System.out.println("You have selected PayUAPI");
    }
}
