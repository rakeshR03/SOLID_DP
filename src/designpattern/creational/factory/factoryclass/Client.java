package designpattern.creational.factory.factoryclass;

public class Client {
    public static void main(String[] args) {
        flipkart fk = new flipkart();
        PaymentAPI paymentAPI = fk.getPaymentAPIBasedOnConfig(PaymentAPIType.PAYU);
        paymentAPI.pay();

    }
}
