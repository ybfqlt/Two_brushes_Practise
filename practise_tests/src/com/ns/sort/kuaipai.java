package com.ns.sort;

/**
 * @Author: xns
 * @Date: 20-3-31 上午11:22
 */
public class kuaipai {

    public static void kuai(int[] arr,int low,int high){
        int i=low,j = high;
        if(low >= high){
            return;
        }
        int mark = arr[low];
        while(low < high){
            while(low < high && arr[high] >= mark){
                high--;
            }
            arr[low] = arr[high];
            while(low < high && arr[low] <= mark){
                low++;
            }
            arr[high] = arr[low];
            if(low >= high){
                arr[low] = mark;
            }
        }
        kuai(arr,i,low-1);
        kuai(arr,low+1,j);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,4,6,3,2,5,7,0,2};
        kuai(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
