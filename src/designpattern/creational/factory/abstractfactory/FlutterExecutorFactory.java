package designpattern.creational.factory.abstractfactory;

public class FlutterExecutorFactory {
    public static FlutterExecutor getFlutterExecutorBasedOnConfig(Platform platform){
        switch(platform){
            case ANDROID:
                return new AndroidFlutterExecutor();

            case IOS:
                return new IOSFlutterExecutor();
        }
        return null;
    }
}
