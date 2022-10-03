package by.itstep.dimakhodosevich.controller;

public class FirstThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.printf("id = %d, name = %s\n", getId(), getName());
        }
    }
}
