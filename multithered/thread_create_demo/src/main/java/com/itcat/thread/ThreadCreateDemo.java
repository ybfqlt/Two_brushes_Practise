package com.itcat.thread;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Classname ThreadCreateDemo
 * @Description TODO
 * @Date 19-9-26 下午4:49
 * @Created by xns
 */
public class ThreadCreateDemo {
    public static void main(String[] args) throws InterruptedException {
//        //继承thread类创建线程
//        //1.创建自定义的线程类实例
//        MyThread myThread = new MyThread();
//        //2.启动线程
//        myThread.start();
//        //3.在main主线程打印信息
//        for(int i=0;i<10;i++){
//            System.out.println("main主线程执行了:"+(new Date()).getTime());
//        }
        //实现runnable接口
        //1.在main主线程打印信息
//        for(int i=0;i<10;i++){
//            System.out.println(Thread.currentThread().getName()+"执行时间: "+(new Date()).getTime()+";执行次数是: "+i);
//        }
//        //2.通过thread类执行MyRunnable类
//        Thread thread = new Thread(new MyRunnable(),"MyRunnable");
//        thread.start();
        //实现Callable接口
        //1.创建FutureTask实例,创建 MyCallable实例
        FutureTask<String> task = new FutureTask<String>(new MyCallable());
        //2.创建Thread实例，执行FutureTask
        Thread thread = new Thread(task,"MyCallable");
        thread.start();
        //3.在主线程打印信息
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"执行时间: "+(new Date()).getTime()+";执行次数是: "+i);
        }
        //4.获取并打印MyCallable执行结果
        try{
            String result = task.get();
            System.out.println("MyCallable执行结果是:"+result);
        }catch(ExecutionException e){
            e.printStackTrace();
        }
    }
}
