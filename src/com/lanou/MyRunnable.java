package com.lanou;

/**
 * Created by dllo on 17/11/9.
 */
public class MyRunnable implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <300 ; i++) {
            String name=Thread.currentThread().getName();
            System.out.println(name+" "+i);
        }

    }
}

