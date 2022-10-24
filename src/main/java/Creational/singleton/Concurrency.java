package Creational.singleton;

public class Concurrency {
    private static int t;
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++)
                    System.out.println(t++);
            }).start();
        }
    }

}
