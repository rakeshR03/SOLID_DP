package designpattern.behavioural.observer.after;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private List<PaymentSuccessEventSubscriber> paymentSuccessEventSubscriberList = new ArrayList<>();

    public void subscribe(PaymentSuccessEventSubscriber paymentSuccessEventSubscriber){
        paymentSuccessEventSubscriberList.add(paymentSuccessEventSubscriber);
    }

    public void unsubscribe(PaymentSuccessEventSubscriber paymentSuccessEventSubscriber){
        paymentSuccessEventSubscriberList.remove(paymentSuccessEventSubscriber);
    }

    public void paymentSuccess(int order){
        for(PaymentSuccessEventSubscriber subscriber : paymentSuccessEventSubscriberList){
            subscriber.notify(order);
        }
    }

}
