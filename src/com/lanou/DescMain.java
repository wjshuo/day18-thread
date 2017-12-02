package com.lanou;

/**
 * Created by dllo on 17/11/9.
 */
//多线程编程知识点
public class DescMain {
    /*
    多线程编程:采用多线程编程的方式实现多个任务同时执行
    叫做多任务并发执行,也称多任务并行
    这种执行多个任务的形式叫做多线程编程
    如:一个浏览器,可以同时执行下载,浏览新闻,播放音乐,等任务.
    qq聊天,可以同时执行和多个好友,多个群聊天的任务.
    2.多线程编程解决的问题
    复杂的算法,耗时的操作,网络相关,IO流相关.
    3.进程与线程.
    进程:指的是一个应用程序,任务管理器中的每一个选项都是进程,一个网站.qq是一个进程,淘宝是一个进程.
    线程:进程中执行流程(任务)
    一个聊天窗口是qq的一个线程.
    4.进程与线程的包含关系
    一个进程可以有多个进程
    一个线程只能属于一个进程
    5.主线程
    每一个进程都要有执行主线,java里指的是主方法
    进程中主要的执行流程叫做主线程.
    6.线程的执行方式
    抢占式运行
    多个线程(任务)以抢占的形式去争夺cpu的使用权限
    线程不好掌控(控制线程难)
    7.IO操作,网络操作都在线程里
    8.线程生命周期



     */

    /*
    1.线程的创建
    在java中代表线程的类是Thread
    创建类继承Thread
    复写run方法
    将耗时的操作(线程的任务代码)写在run方法里
    2.线程的创建方式2
    实现Runnable接口
    复写run方法
    3.线程需要启动才能执行
    一般线程的启动放在主方法中进行

    4.线程的启动方式1:
    继承Thread类的线程启动
    创建对象,调用start方法
    5.线程的启动方式2:
    实现Runnable接口的线程启动
    Java规定只有Thread才是线程,Runnable不是线程,但是Runnable具有run方法,可以作为线程的任务
    因此,创建Thread对象,把Runnable接口作为线程的实例任务传入这个Thread之后启动.

    6.继承Thread类和是吸纳Runnable接口
    这两种方式都可以创建出线程
    区别:多态
    继承Thread类,由于java单继承,这个类不能再有其他父类了.
    但是这种方式使用方便.new 对象start就可以启动
    适用于不需要继承其他类的情况
    实现Runnable接口:
    可以实现其他接口,还可以拥有一个父类
    但是这种方式创建线程,在启动的时候需要借助Thread
    7.线程的启动为什么用start而不用run方法
    线程想要实现抢占式运行,只有通过start才是启动线程实现抢占式
    如果调用run方法,是把run方法作为Thread类的普通方法了
    不再是线程了,失去了多线程的意义
    因此不使用run方法.






     */
    public static void main(String[] args) {
        //启动线程
        MyThread myThraed=new MyThread();

        myThraed.setName("秀晶");
        myThraed.start();

        //启动线程2
        MyRunnable runnable=new MyRunnable();
        //单纯的Thread是没有线程任务的也就是说没有run方法
        //但是MyRunnable实现了run方法
        //MyRunnable和Thread结合,及时线程又有run方法
        //通过他两的结合作为线程来使用
        Thread thread=new Thread(runnable);
        thread.setName("fx");
;       thread.start();




    }














}
