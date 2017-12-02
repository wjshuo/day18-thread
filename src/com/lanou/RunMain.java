package com.lanou;

/**
 * Created by dllo on 17/11/9.
 */
public class RunMain implements Runnable{
    @Override
    public void run() {
        int count =100;
        while (count>0){
            System.out.println("fx"+count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;
        }



    }
}
