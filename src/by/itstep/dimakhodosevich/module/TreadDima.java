package by.itstep.dimakhodosevich.module;

import by.itstep.dimakhodosevich.controller.FirstThread;

public class TreadDima {
    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        thread.start();
        Thread m = Thread.currentThread();
        while(true){
            System.out.printf("id = %d, name = %s\n", m.getId(), m.getName());
        }
    }
}
