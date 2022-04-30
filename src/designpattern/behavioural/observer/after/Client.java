package designpattern.behavioural.observer.after;

public class Client {
    private static EmailService emailService = new EmailService();
    private static InvoiceService invoiceService = new InvoiceService();

    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();
        flipkart.subscribe(emailService);
        flipkart.subscribe(invoiceService);

        flipkart.paymentSuccess(101);
    }
}
