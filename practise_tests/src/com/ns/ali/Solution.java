package com.ns.ali;

import java.util.Scanner;

class Solution {
    public static String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        for(String a:strings){
            System.out.println(a);
        }
        StringBuffer stringbuffer = new StringBuffer();
        for(int i=strings.length-1;i>=0;i--){
            if(strings[i].equals("")){
                continue;
            }
            if(i==0){
                stringbuffer.append(strings[i].trim());
            }else{
                stringbuffer.append(strings[i].trim()).append(" ");
            }
        }
        return stringbuffer.toString();
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        System.out.println(str.trim());
//        System.out.println(reverseWords(str));
        int i=0;
        Integer a;
        a=i;
        i=a;
        System.out.println(a+" "+i);
    }
}