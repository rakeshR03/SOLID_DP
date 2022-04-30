package designpattern.creational.factory.abstractfactory;

public interface FlutterExecutor {
    void printHello();

    FlutterExecutorUIComponentFactory getFlutterExecutorUIComponentFactory();
}
