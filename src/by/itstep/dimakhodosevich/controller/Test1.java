package by.itstep.dimakhodosevich.controller;

public class Test1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
//        System.out.println(Thread.currentThread());
        System.out.println("Thread id = " + t.getId());
        System.out.println("Thread name = " + t.getName());
        t.setName("Dima");
        System.out.println("Thread name = " + t.getName());
        System.out.println("Thread group" + t.getThreadGroup());
        System.out.println("Thread priority = " + t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread priority = " + t.getPriority());
        System.out.println("is alive = " + t.isAlive());
        System.out.println("is daemon = " + t.isDaemon());
        System.out.println("is kill = " + t.isInterrupted());
        System.out.println("state = " + t.getState());


    }
}
