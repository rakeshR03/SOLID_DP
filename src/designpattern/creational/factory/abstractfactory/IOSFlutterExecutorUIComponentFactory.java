package designpattern.creational.factory.abstractfactory;

public class IOSFlutterExecutorUIComponentFactory implements FlutterExecutorUIComponentFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }
}
