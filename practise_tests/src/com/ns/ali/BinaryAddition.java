package com.ns.ali;

import java.util.Scanner;

/**
 * @Author: lt
 * @Date: 20-4-3 下午6:59
 */
public class BinaryAddition {

    public static String addBinary(String a, String b) {
        //记录最终结果
        StringBuffer res = new StringBuffer();
        //是否要进位
        int flag=0;
        int min,i;
        String s="";
        //记录最小字符串的长度,以及截取长字符串的多出部分
        if(a.length()<b.length()){
            min=a.length();
            s = b.substring(0,b.length()-a.length());
        }else{
            min=b.length();
            s = b.substring(0,a.length()-b.length());
        }
        //先计算共有部分，得到的结果
        for(i=min-1;i>=0;i--){
            if(a.charAt(i)=='1'&&b.charAt(i)=='1'){
                if(flag == 1){
                    res.append('1');
                }else{
                    res.append('0');
                }
                flag =1;
            }
            else if(a.charAt(i)=='1'&&b.charAt(i)=='0'||b.charAt(i)=='1'&&a.charAt(i)=='0'){
                if(flag == 1){
                    res.append('0');
                    flag=1;
                }else{
                    res.append('1');
                }
            }
            else if(a.charAt(i)=='0'&&b.charAt(i)=='0'){
                if(flag == 1){
                    res.append('1');
                    flag=0;
                }else{
                    res.append('0');
                }
            }
            else{
                return null;
            }
        }
        //多较长的二进制串多余部分的处理
        int t = s.length()-1;
        while(t>=0){
            if(s.charAt(t)!='1'||s.charAt(t)!='0'){
                return null;
            }
            if(flag == 1 && s.charAt(t)=='1'){
                res.append('0');
                flag =1;
            }
            else if(flag == 0&& s.charAt(t)=='0'){
                res.append('0');
            }else{
                res.append('0');
                flag = 0;
            }
            t--;
        }
        if(flag == 1){
            res.append('1');
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(addBinary(a,b));
    }
}