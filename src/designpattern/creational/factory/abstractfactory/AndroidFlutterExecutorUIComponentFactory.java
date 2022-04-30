package designpattern.creational.factory.abstractfactory;

public class AndroidFlutterExecutorUIComponentFactory implements FlutterExecutorUIComponentFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }
}
