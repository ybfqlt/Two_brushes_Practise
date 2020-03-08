package com.ns.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xns
 * @Date: 20-2-10 上午12:24
 */
public class test2 {
    public static boolean isValid(String s) {
        List<Character> lists = new ArrayList<>();
        lists.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(lists.get(lists.size()-1) == s.charAt(i)){
                lists.remove(lists.size()-1);
            }
            else{
                lists.add(s.charAt(i));
            }
        }
        if(lists.size()==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
