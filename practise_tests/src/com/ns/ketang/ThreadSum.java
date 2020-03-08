package com.ns.ketang;

/**
 * @Author: xns
 * @Date: 20-2-28 下午12:58
 */
public class ThreadSum extends Thread {

    long n;
    long sum;

    public boolean isInCircle() {
        double x = Math.random();
        double y = Math.random();
        if ((x - 0.5) * (x - 0.5) + (y - 0.5) * (y - 0.5) < 0.25) {
            return true;
        } else {
            return false;
        }
    }

    ThreadSum(int n) {
        sum = 0;
        this.n = n;
    }


    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            if (isInCircle()) {
                sum++;
            }
        }
    }

    public long getSum() {
        return sum;
    }
}
