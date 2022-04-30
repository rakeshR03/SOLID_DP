package designpattern.creational.factory.abstractfactory;

public class IOSButton implements Button{
    @Override
    public void getButton() {
        System.out.println("IOS button");
    }
}
