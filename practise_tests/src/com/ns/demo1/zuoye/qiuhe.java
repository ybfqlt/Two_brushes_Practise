package com.ns.demo1.zuoye;

/**
 * @Author: xns
 * @Date: 20-3-13 下午10:09
 */
public class qiuhe {
    public static final int NUM_SEG = 5;
    public static void main(String[] args) {
        work[] jilu = new work[NUM_SEG];
        Integer sum=0;
        Integer[] a = new Integer[50];
        for(int i=0;i<a.length;i++){
            a[i] = i;
        }
        ThreadPool threadPool = new ThreadPool(10);
        for (int i = 0; i <NUM_SEG; i++) {
            jilu[i] = new work(a,NUM_SEG,i,a.length);
            threadPool.execute(jilu[i]);
        }
        threadPool.join();

        for(int i=0;i<NUM_SEG;i++){
            sum+=jilu[i].getResult();
        }
        System.out.println(sum);
    }
}
