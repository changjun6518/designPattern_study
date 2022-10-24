package Creational.singleton;

public class Singleton3 {

    private static Singleton3 singleton;

    static {
        try {
            singleton = new Singleton3();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return singleton;
    }

}
