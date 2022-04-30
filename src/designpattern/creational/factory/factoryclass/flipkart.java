package designpattern.creational.factory.factoryclass;

public class flipkart {
    private PaymentAPI paymentAPI;
    public PaymentAPI getPaymentAPIBasedOnConfig(PaymentAPIType type){
        switch (type){
            case RPAY:
                return new RazorpayAPI();

            case PAYU:
                return new PayUAPI();
        }
        return null;
    }
}
