package com.ns.sort;

/**
 * @Author: xns
 * @Date: 20-3-22 下午6:08
 */
public class Bubble {
    public static void bubble(int[] a){
        boolean flag = true;
        for(int i=0;i<a.length && flag;i++){
            flag = false;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,1,7,9,5,8};
        bubble(a);
    }
}
