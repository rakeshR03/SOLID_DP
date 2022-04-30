package designpattern.creational.factory.factorymethod;

public class FlutterExecutorFactory {

    public static FlutterExecutor getFlutterExecutorFactoryBasedOnConfig(Platform platform){
        switch(platform){
            case ANDROID :
                return new AndroidFlutterExecutor();

            case IOS:
                return new IOSFlutterExecutor();
        }
        return null;
    }
}
