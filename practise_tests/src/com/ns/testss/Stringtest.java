package com.ns.testss;

import java.util.ArrayList;

/**
 * @Author: xns
 * @Date: 20-2-25 下午12:52
 */
public class Stringtest {
    public void test(){
        ArrayList<Integer> list = new ArrayList<>();
    }
    public static void main(String[] args) throws InterruptedException {
        StringBuffer a = new StringBuffer();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        a.append("b");
                    }
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(a.length());
    }
}
