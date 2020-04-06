package com.ns.sort;

/**
 * @Author: xns
 * @Date: 20-4-6 上午11:30
 */
public class HeapSort {

    public static void swap(int[] arr,int a,int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    private static void adjustHeap(int[] arr,int i,int length){
        int temp =arr[i];
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length&&arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k]>temp){
                arr[i] = arr[k];
                i=k;
            }else{
                break;
            }
        }
        arr[i]=temp;
    }

    private static void sort(int[] arr){
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        for(int i=arr.length-1;i>0;i--){
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,4,6,3,2,5,7,0,2};
        sort(arr);
        for(int value : arr) {
            System.out.print(value + " ");
        }
    }
}
