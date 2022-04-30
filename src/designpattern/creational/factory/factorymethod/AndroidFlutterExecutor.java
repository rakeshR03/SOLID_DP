package designpattern.creational.factory.factorymethod;

public class AndroidFlutterExecutor implements FlutterExecutor{
    @Override
    public void printHello() {
        System.out.println("Hello");
    }

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }
}
