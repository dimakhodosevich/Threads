package by.itstep.dimakhodosevich.module;

import by.itstep.dimakhodosevich.controller.FirstThread;
import by.itstep.dimakhodosevich.controller.SecondThread;

import java.util.concurrent.TimeUnit;

public class secondController {
    public static void main(String[] args) throws InterruptedException {
        SecondThread secondThreadLogic = new SecondThread();
        Thread thread = new Thread(secondThreadLogic);
        thread.start();

//        Thread.sleep(1000);
        TimeUnit.SECONDS.sleep(5);
        System.out.println("sdkfjas;dkfa");

        Thread m = Thread.currentThread();
        while(true){
            System.out.printf("id = %d, name = %s\n", m.getId(), m.getName());
        }

    }
}
