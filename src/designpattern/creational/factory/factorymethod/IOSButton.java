package designpattern.creational.factory.factorymethod;

public class IOSButton implements Button{
    @Override
    public void getButton() {
        System.out.println("This is IOS button");
    }
}
