package designpattern.creational.singleton;

public class Client {
    public static void main(String[] args) {
        DBC d1 = DBC.getInstance();
        DBC d2 = DBC.getInstance();
    }
}
