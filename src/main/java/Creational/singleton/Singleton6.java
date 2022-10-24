package Creational.singleton;

public class Singleton6 {

    private Singleton6() {

    }

    private static final class SingletonHolder {

        private static final Singleton6 singleton = new Singleton6();
    }

    public static synchronized Singleton6 getInstance() {
        return SingletonHolder.singleton;
    }

}
