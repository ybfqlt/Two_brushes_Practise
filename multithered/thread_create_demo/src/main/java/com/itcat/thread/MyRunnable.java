package com.itcat.thread;

import java.util.Date;

/**
 * @Classname MyRunnable
 * @Description 自定义类实现Runnable接口
 * @Date 19-9-26 下午5:08
 * @Created by xns
 */
public class MyRunnable implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"执行时间: "+(new Date()).getTime()+";执行次数是: "+i);
        }
    }
}
