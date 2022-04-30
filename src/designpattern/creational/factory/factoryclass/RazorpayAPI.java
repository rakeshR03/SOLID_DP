package designpattern.creational.factory.factoryclass;

public class RazorpayAPI implements PaymentAPI{
    @Override
    public void pay() {
        System.out.println("you have selected Razorpay API");
    }
}
