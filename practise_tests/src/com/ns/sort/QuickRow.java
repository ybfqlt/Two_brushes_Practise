package com.ns.sort;

import java.util.Stack;

/**
 * @Author: xns
 * @Date: 20-4-6 上午11:30
 */
public class QuickRow {

    public static int Pritation(int[] arr,int left,int right){
        int priot = arr[left];
        while(left<right){
            while(left < right && arr[right]>=priot){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left]<=priot){
                left++;
            }
            arr[right]=arr[left];
        }
        if(left>=right){
            arr[left] = priot;
        }
        return left;
    }

    public static void QuickSort(int[] arr,int left,int right){
        Stack<Integer> stack = new Stack<>();
        int i,j;
        if(arr.length==0||arr==null){
            return;
        }
        stack.push(right);
        stack.push(left);
        while(!stack.isEmpty()){
            i=stack.pop();
            j=stack.pop();
            if(i<j){
                int k = Pritation(arr,i,j);
                if(k>i){
                    stack.push(k-1);
                    stack.push(i);
                }
                if(j>k){
                    stack.push(j);
                    stack.push(k+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,4,6,3,2,5,7,0,2};
        QuickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
