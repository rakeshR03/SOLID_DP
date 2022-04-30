package designpattern.behavioural.observer.after;

public class EmailService implements PaymentSuccessEventSubscriber{

    void sendSMS(int order){
        System.out.println("email is sent");
    }

    @Override
    public void notify(int order) {
        sendSMS(order);
    }
}
