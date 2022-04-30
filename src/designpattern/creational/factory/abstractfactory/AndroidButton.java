package designpattern.creational.factory.abstractfactory;

public class AndroidButton implements Button{
    @Override
    public void getButton() {
        System.out.println("Android Button");
    }
}
