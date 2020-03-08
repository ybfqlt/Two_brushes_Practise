package com.ns.demo2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: xns
 * @Date: 20-2-15 下午8:48
 */
public class VolatieTest {
    private volatile static boolean initFlag = false;

//    private static boolean initFlag = false;
    public static void main(String[] args) throws InterruptedException{
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("waiting data...");
                while(!initFlag){
                }
                System.out.println("===============success");
            }
        }).start();

        Thread.sleep(2000);  //确保线程1一定已经开始执行了。

        new Thread(new Runnable() {
            @Override
            public void run() {
                prepareData();
            }
        }).start();
    }

    public static void prepareData(){
        System.out.println("prepareing data...");
        initFlag = true;
        System.out.println("prepare data end...");
    }
}
