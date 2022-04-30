package designpattern.behavioural.strategy;

public class Client {

    public static void main(String[] args) {
        ClearTax clearTax = new ClearTax();
        double tax = clearTax.calculateTax(TaxCalculatingStrategyType.NEW, 10000);
        System.out.println("tax: "+tax);
    }
}
