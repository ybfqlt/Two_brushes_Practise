package com.ns.xu;

/**
 * @Author: 饿汉式
 * @Date: 20-4-2 下午5:22
 */
public class Singletoner {
    private static Singletoner singletoner = new Singletoner();

    private Singletoner(){

    }

    public static Singletoner getInstance(){
        return singletoner;
    }
}
