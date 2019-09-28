package com.itcat.thread;

/**
 * @Classname Ticket
 * @Description TODO
 * @Date 19-9-28 上午11:19
 * @Created by xns
 */
public class Ticket implements Runnable{
    private int ticketNum = 100;//电影票的数量

    private Object obj = new Object();

    public void run(){
        while(true){
//            synchronized (obj) {
//                if (ticketNum > 0) {
//                    //有票,让线程睡眠100毫秒
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    //打印当前售出的票数字和线程名
//                    String name = Thread.currentThread().getName();
//                    System.out.println("线程" + name + "销售电影票: " + ticketNum--);
//                }
//            }
            saleTicket();
        }
    }

    private synchronized void saleTicket(){
        if(ticketNum>0){
            if (ticketNum > 0) {
                //有票,让线程睡眠100毫秒
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //打印当前售出的票数字和线程名
                String name = Thread.currentThread().getName();
                System.out.println("线程" + name + "销售电影票: " + ticketNum--);
            }
        }
    }
}
