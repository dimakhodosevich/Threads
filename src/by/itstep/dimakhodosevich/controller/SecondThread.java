package by.itstep.dimakhodosevich.controller;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        while(true){
            Thread thread = Thread.currentThread();
            System.out.printf("id = %d, name = %s\n", thread.getId(), thread.getName());
        }
    }
}
