package com.ns.xu;

/**
 * @Author: 懒汉
 * @Date: 20-4-2 下午4:29
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton == null) {
            singleton =  new Singleton();
        }
        return singleton;
    }
}
