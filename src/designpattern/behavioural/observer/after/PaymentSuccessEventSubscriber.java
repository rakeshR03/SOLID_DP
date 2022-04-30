package designpattern.behavioural.observer.after;

public interface PaymentSuccessEventSubscriber {
    public void notify(int order);
}
