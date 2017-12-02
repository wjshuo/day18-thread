package com.lanou.ticket;

/**
 * Created by dllo on 17/11/9.
 */
public class Thread12306 extends Thread {
    private Ticket ticket;
    public Thread12306(Ticket ticket){
        this.ticket=ticket;
    }

    @Override
    public void run() {
        super.run();
        while(true){
            boolean buyResult=ticket.buy();
            //if(!buyResult){
            if (buyResult==false){
                break;//如果返回结果是false
                //证明没票了,停止购买.
            }
        }


    }
}
