package com.hhh;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname JConsole
 * @Description TODO
 * @Date 19-9-22 上午11:04
 * @Created by xns
 */
public class JConsoleTest {
    public JConsoleTest() {
        byte[] b1 = new byte[128 * 1024];
    }
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fill(1000);
    }

    private static void fill(int n){
        List<JConsoleTest> jlist = new ArrayList<>();

        for(int i=0;i<n;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            jlist.add(new JConsoleTest());
        }
    }

}
