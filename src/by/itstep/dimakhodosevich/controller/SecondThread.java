package by.itstep.dimakhodosevich.controller;

import java.util.concurrent.TimeUnit;

public class SecondThread implements Runnable{
    @Override
    public void run() {
            Thread thread = Thread.currentThread();

        //        while(true){
//            Thread thread = Thread.currentThread();
//            System.out.printf("id = %d, name = %s\n", thread.getId(), thread.getName());
//        }
        for (int i = 0; i < 1000; i++) {
//            try{
//                TimeUnit.MILLISECONDS.sleep(200);
//            }catch (InterruptedException e){
//                e.getStackTrace();
//            }
            System.out.printf("id = %d, name = %s\n", thread.getId(), thread.getName());
        }

        System.out.printf("The %s thread finished....", thread.getName());

    }
}
