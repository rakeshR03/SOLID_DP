package designpattern.creational.factory.factorymethod;

public class Client {
    public static void main(String[] args) {
        FlutterExecutor flutterExecutor = FlutterExecutorFactory.getFlutterExecutorFactoryBasedOnConfig(Platform.IOS);
        Button b = flutterExecutor.createButton();
        b.getButton();
    }
}
