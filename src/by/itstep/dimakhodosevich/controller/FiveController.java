package by.itstep.dimakhodosevich.controller;

public class FiveController {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        Thread[] threads = new Thread[count];
        SecondThread threadLogic = new SecondThread();

        System.out.println("\nThe main thread start");

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(threadLogic);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("Main thread is finished!!!");
    }
}
