package designpattern.creational.factory.abstractfactory;



public class AndroidFlutterExecutor implements FlutterExecutor{
    @Override
    public void printHello() {
        System.out.println("Hello");
    }

    @Override
    public AndroidFlutterExecutorUIComponentFactory getFlutterExecutorUIComponentFactory() {
        return new AndroidFlutterExecutorUIComponentFactory();
    }
}
