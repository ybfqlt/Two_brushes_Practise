package com.test4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname OOMObject
 * @Description TODO
 * @Date 19-12-8 下午3:11
 * @Created by xns
 */


public class OOMObject1 {

    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException{
        List<OOMObject> list = new ArrayList<>();
        for(int i=0;i<num;i++){
            Thread.sleep(50);
            list.add(new OOMObject());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
        System.gc();
    }
}