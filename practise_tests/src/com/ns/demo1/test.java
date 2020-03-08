package com.ns.demo1;

import java.util.ArrayList;

public class test{
    byte[] a = new byte[1024*100];

    public static void main(String[] args) throws InterruptedException {
        ArrayList<test> tests = new ArrayList<>();
        while(true){
            tests.add(new test());
            Thread.sleep(10);
        }
    }
}