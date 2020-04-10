package com.ns.finger;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: xns
 * @Date: 20-4-6 下午11:11
 */
public class Solution1 {
    public static int longestPalindrome(String s){
        if(s.length() == 0){
            return 0;
        }
        HashSet<Character> hashSet = new HashSet<Character>();
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i=0;i<chars.length;i++){
            if(!hashSet.contains(chars[i])){
                hashSet.add(chars[i]);
            }else{
                hashSet.remove(chars[i]);
                count++;
            }
        }
        return hashSet.isEmpty()?count*2:count*2+1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.println(longestPalindrome(a));
    }
}
