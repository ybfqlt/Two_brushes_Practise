package com.ns.demo1.zuoye;

/**
 * @Author: xns
 * @Date: 20-3-13 下午10:10
 */
public class work implements Runnable{
    private int threadNum;
    private int segNum;	//数据段的序号
    private int num; //数组中元素数量
    private int result = 0;
    private Integer[] a=null;

    public work(Integer[] a, int threadNum, int segNum, int num){
        this.num = num;
        this.segNum = segNum;
        this.threadNum = threadNum;
        this.a =a;
    }

    @Override
    public void run() {
        int start,end;
        //划分数据块的起点和终点
        start = (int) (((float)(num/threadNum)) * segNum);
        end = (int) ((float)(num/threadNum) * (segNum + 1));

        if(segNum == threadNum - 1) {
            end = num;
        }

        for(int i=start; i<end; i++) {
            result = result + a[i];
        }
    }
    public int getResult(){
        return result;
    }
}
