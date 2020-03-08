package com.ns.suiji;

/**
 * @Author: xns
 * @Date: 20-2-24 上午10:11
 */
public class xunhuan {
    public static void main(String[] args) {
        String a1="";
        String b1="";
        here:
        for(int i=1;i<=4;i++){
            a1 = "外层循环第"+i+"层";
            System.out.println(a1);
            for(int j=1;j<=4;j++){
                b1="内层循环第"+j+"层";
                System.out.println(b1);
                if(2==j&2==i){
                    break here;
                }
            }
        }
    }
}
