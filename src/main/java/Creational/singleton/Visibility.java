package Creational.singleton;

import java.util.concurrent.TimeUnit;

public class Visibility {
    private static volatile boolean stopRequested; //무조건 메인 메모리에서 가져온다. -> volatile 해주면 됨~!

    public static void main(String[] args) throws InterruptedException {
        Thread background = new Thread(() -> {
            for (int i = 0; !stopRequested ; i++); //(N)
            System.out.println("background 쓰레드가 종료되었습니다!");
        });
        background.start(); //(A)

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true; //(B)
        System.out.println("main 쓰레드가 종료되었습니다!");
    }

}
