package com.test3;

/**
 * @Classname testBig
 * @Description TODO
 * @Date 19-12-3 下午10:11
 * @Created by xns
 */
public class testBig {
    private static final int _1MB = 1024*1024;

    public static void testPretenureSizeThreshold(){
        byte[] allocation;
        allocation = new byte[4*_1MB];
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
