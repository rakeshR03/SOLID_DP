package designpattern.behavioural.observer.after;

public class InvoiceService implements PaymentSuccessEventSubscriber{

    void sendInvoice(int order){
        System.out.println("invoice is sent");
    }
    @Override
    public void notify(int order) {
        sendInvoice(order);
    }
}
