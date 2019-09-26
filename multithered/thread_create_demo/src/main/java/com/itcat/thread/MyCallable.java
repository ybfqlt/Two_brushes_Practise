package com.itcat.thread;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @Classname MyCallable
 * @Description TODO
 * @Date 19-9-26 下午6:35
 * @Created by xns
 */
public class MyCallable implements Callable<String> {
    public String call() throws Exception{
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"执行时间是: "+(new Date()).getTime()+";循环次数: "+i);
        }
        return "MyCallable接口执行完成!";
    }
}
