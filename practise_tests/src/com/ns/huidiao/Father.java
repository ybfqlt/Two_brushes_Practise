package com.ns.huidiao;

/**
 * @Author: xns
 * @Date: 20-2-28 下午1:25
 */
public class Father implements CallBack {

    private volatile boolean isflag = true;

    public void letSonDoWork(String thing) {
        Son son = new Son(this);

        new Thread(new Runnable() {
            @Override
            public void run() {
                son.letSon(thing);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (isflag) {
                    System.out.println("父亲看电视...");
                }
            }
        }).start();

    }

    @Override
    public void check() {
        isflag = false;
        System.out.println("儿子做完了，父亲检查作业");
    }
}
