package com.ns.demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: xns
 * @Date: 20-3-8 下午12:24
 */
public class test3 {
    public static void main(String[] args) {
        int aw=2,e=3;
        String b = "aaa";
        String b2 = new String("aaa");
        StringBuffer a = new StringBuffer("aaa");
        StringBuffer a2 = new StringBuffer("aaa");
        System.out.println(b.equals(b2));
        System.out.println(b==b2);
        System.out.println(b.equals(a));
        System.out.println(a.equals(a2));
        System.out.println(a2 == a);
        HashMap<String,String> cc = new HashMap();
        Hashtable<String,String> cv = new Hashtable<>();
        ConcurrentHashMap<String,String> cb = new ConcurrentHashMap<>();
        cc.put("aa","a");
        cv.put("a","a");
        cb.put("aa","aa");
        ArrayList<String> list = new ArrayList();
        list.add("Aa");
        LinkedList<String> lists = new LinkedList<>();
        lists.add("aa");
    }
}
