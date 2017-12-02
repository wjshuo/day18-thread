package com.lanou;

/**
 * Created by dllo on 17/11/9.
 */
public class TestThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <100; i++) {
            System.out.println("秀晶"+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }




    }
}
