package by.itstep.dimakhodosevich.controller;

import java.util.concurrent.TimeUnit;

public class ThirdController {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The main thread started!!!");
        SecondThread thread = new SecondThread();
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        TimeUnit.SECONDS.sleep(3);

        System.out.println("The main thread finished....");
    }
}
