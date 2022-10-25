package Creational.singleton;

import java.util.concurrent.TimeUnit;

public class Visibility {
    private static volatile boolean stopFlag; // main memory(RAM)에서 가져옴

    public static void main(String[] args) throws InterruptedException {
        Thread ThreadB = new Thread(() -> {
            for (int i = 0; !stopFlag; i++); // --- (1)
            System.out.println("ThreadB 종료.");
        });
        ThreadB.start(); // --- (2)

        TimeUnit.SECONDS.sleep(1);
        stopFlag = true; // --- (3)
        System.out.println("main 쓰레드가 종료.");
    }

}
