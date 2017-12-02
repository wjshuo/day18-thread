package com.lanou;

/**
 * Created by dllo on 17/11/9.
 */
public class Main {
    public static void main(String[] args) {
        TestThread testThread=new TestThread();
        testThread.start();

        RunMain runMain=new RunMain();
        Thread thread=new Thread(runMain);
        thread.start();

        //最简单的创建线程方式
        //匿名对象那个创建线程
        //需要Thread+run方法
        //只需要执行一次就ok的任务


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 18; i++) {
                    System.out.println("qq"+i);
                    try {
                        Thread.sleep(2000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();






    }
}
