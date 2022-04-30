package designpattern.creational.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        FlutterExecutor flutterExecutor = FlutterExecutorFactory.getFlutterExecutorBasedOnConfig(Platform.IOS);
        Button button = flutterExecutor.getFlutterExecutorUIComponentFactory().createButton();
        button.getButton();
    }
}
