package by.itstep.dimakhodosevich.controller;

import java.util.concurrent.TimeUnit;

public class FourController {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        Thread[] threads = new Thread[count];
        SecondThread threadLogic = new SecondThread();

        System.out.println("\nThe main thread start");

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(threadLogic);
            threads[i].start();
        }

        while (true) {

            if (threads[0].isAlive() || threads[1].isAlive() || threads[2].isAlive()
                    || threads[3].isAlive() || threads[4].isAlive()) {
                break;
            } else {
                break;
            }
        }

        System.out.println("Main thread is finished!!!");
    }
}
