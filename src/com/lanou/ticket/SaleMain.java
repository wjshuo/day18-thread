package com.lanou.ticket;

/**
 * Created by dllo on 17/11/9.
 */
public class SaleMain {
    public static void main(String[] args) {
        //通过卖票问题讲解线程的同步和锁.
        Ticket ticket=new Ticket();
        //开始抢票
        new Thread12306(ticket).start();
        new Thread12306(ticket).start();
        new Thread12306(ticket).start();
        new Thread12306(ticket).start();
        new Thread12306(ticket).start();





    }
}
