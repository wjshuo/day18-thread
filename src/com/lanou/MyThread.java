package com.lanou;

/**
 * Created by dllo on 17/11/9.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 300; i++) {
            String name =Thread.currentThread().getName();
            System.out.println(name+" "+i);
        }




    }
}
