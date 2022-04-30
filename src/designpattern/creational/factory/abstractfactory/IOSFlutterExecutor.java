package designpattern.creational.factory.abstractfactory;

public class IOSFlutterExecutor implements FlutterExecutor{
    @Override
    public void printHello() {

    }

    @Override
    public IOSFlutterExecutorUIComponentFactory getFlutterExecutorUIComponentFactory() {
        return new IOSFlutterExecutorUIComponentFactory();
    }
}
