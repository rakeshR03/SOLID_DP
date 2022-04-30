package designpattern.creational.factory.factorymethod;

public class IOSFlutterExecutor implements FlutterExecutor{
    @Override
    public void printHello() {
        System.out.println("Hello");
    }

    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }
}
