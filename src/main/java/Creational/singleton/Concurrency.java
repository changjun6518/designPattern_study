package Creational.singleton;

public class Concurrency {
    private static int num;
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            synchronized (new Thread()) {
                {
                    for (int j = 0; j < 1000; j++)
                        System.out.println(num++);
                }
            }
        }
    }

}
