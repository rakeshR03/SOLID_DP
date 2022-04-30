package designpattern.creational.factory.factorymethod;

public class AndroidButton implements Button{
    @Override
    public void getButton() {
        System.out.println("This is android button");
    }
}
