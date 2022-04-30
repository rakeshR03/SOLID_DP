package designpattern.creational.singleton;

public class DBC {
    private static DBC dbc = new DBC();
    private DBC(){};
    public static DBC getInstance(){
        return dbc;
    }
}
