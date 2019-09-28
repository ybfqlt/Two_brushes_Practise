package com.itcat.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname Ticket
 * @Description TODO
 * @Date 19-9-28 上午11:19
 * @Created by xns
 */
public class Ticket implements Runnable{
    /**
     * 电影票的数量
     */
    private int ticketNum = 100;

    private Object obj = new Object();

    /**
     * 参数是是否公平锁：true-公平锁,多个线程都公平拥有执行权；false-非公平 ，独占锁
     */
    private Lock lock = new ReentrantLock(false);

    public void run(){
        while(true){
            lock.lock();
            try{
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
            }finally {
               lock.unlock();
            }
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
//            saleTicket();
        }
    }

//    private synchronized void saleTicket(){
//        if(ticketNum>0){
//            if (ticketNum > 0) {
//                //有票,让线程睡眠100毫秒
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //打印当前售出的票数字和线程名
//                String name = Thread.currentThread().getName();
//                System.out.println("线程" + name + "销售电影票: " + ticketNum--);
//            }
//        }
//    }
}
