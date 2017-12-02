package com.lanou.ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by dllo on 17/11/9.
 */
public class Ticket {
    private  int num =500;
    //12306官网上的票信息

    //线程安全:
//    多个线程修改值,使用的值不稳定,线程不安全
    //多个线程在访问buy方法
    //让buy方法 的访问时逐次执行
    //同步方法:
    //多个线程调用一个方法时,要等待其他线程调用完
//    private  int num =500;//票的余额
//    public synchronized boolean buy(){
//        //如果票余额大于0,卖一张
//        if (num>0){
//            String name=Thread.currentThread().getName();
//            System.out.println("购买者是"+name+"票余额为"+num+"卖出一张剩下"+(--num)+"张");
//            return true;//卖出一张,通知购买成功
//        }else{
//            return false;//返回false,通知购买失败
//
//        }
        //线程同步问题:多个线程访问一个变量时
        //要等待这个变量被操作完,才可以使用.


    //2.同步代码块
//    private  int num =500;
//    public  boolean buy() {
//        synchronized (Ticket.class) {
//            if (num > 0) {
//                String name = Thread.currentThread().getName();
//                System.out.println("购买者是" + name + "票余额为" + num + "卖出一张剩下" + (--num) + "张");
//
//                return true;
//            } else {
//                return false;
//
//            }
//
//
//        }
//
//
//    }
    //3.线程锁
    private Lock lock=new ReentrantLock();

    public  boolean buy() {
        lock.lock();
            if (num > 0) {
                String name = Thread.currentThread().getName();
                System.out.println("购买者是" + name + "票余额为" + num + "卖出一张剩下" + (--num) + "张");
//把代码解锁
                lock.unlock();
                return true;
            } else {
                return false;

            }


        }


    }









