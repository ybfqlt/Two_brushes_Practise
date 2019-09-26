package com.itcat.thread;

import java.util.Date;

/**
 * @Classname MuThread
 * @Description TODO
 * @Date 19-9-26 下午4:43
 * @Created by xns
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("myThread执行"+(new Date()).getTime());
        }
    }
}
