package com.ns.ketang;

/**
 * @Author: xns
 * @Date: 20-2-28 下午12:55
 */

public class pai {

    public static void main(String[] args) throws InterruptedException {
        int numOfThreads = 100;

        int n = 10000;

        long sum = 0;
        ThreadSum[] threads = new ThreadSum[numOfThreads];

        for (int i = 0; i < numOfThreads; i++) {
            threads[i] = new ThreadSum(n);
            threads[i].start();
        }
        for(int i=0;i<numOfThreads;i++){
            threads[i].join();
        }

        for (int i = 0; i < numOfThreads; i++) {
            sum +=threads[i].getSum();
        }

        double PI = 4*(double)sum/(numOfThreads*n);
        System.out.println(PI);
    }
}
