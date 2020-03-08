package com.ns.huidiao;

/**
 * @Author: xns
 * @Date: 20-2-28 下午1:25
 */
public class Son{

    protected CallBack call;

    public Son(CallBack call){
        this.call=call;
    }

    public void letSon(String thing) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("儿子正在" + thing+".......");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                call.check();
            }
        }).start();
    }
}
