package com.ns.xu;

/**
 * @Author: xns
 * @Date: 20-4-2 下午5:27
 */
public class Singletonsuo {

    private volatile static Singletonsuo singletonsuo = null;

    private Singletonsuo(){
        StringBuilder b = new StringBuilder();
    }

    public static Singletonsuo getInstance(){
        if(singletonsuo == null){
            synchronized (Singletonsuo.class){
                if(singletonsuo == null){
                    singletonsuo = new Singletonsuo();
                }
            }
        }
        return singletonsuo;
    }
}
