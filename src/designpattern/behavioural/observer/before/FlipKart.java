package designpattern.behavioural.observer.before;

public class FlipKart {
    EmailService emailService = new EmailService();
    InventoryService inventoryService = new InventoryService();
    InvoiceService invoiceService = new InvoiceService();
    SMSService smsService = new SMSService();

    public void payment(int order){
        emailService.sendEmail(order);
        inventoryService.updateInventory(order);
        invoiceService.sendInvoice(order);
        smsService.sendSMS(order);
    }
}

// violates SRP principle
// violates Open-close principle
