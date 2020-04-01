package com.ns.demo1;

import java.util.*;
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
        TreeMap<String,String> treeMap = new TreeMap<>();
        cc.put("aa","a");
        cc.get("aa");
        cv.put("a","a");
        cv.get("a");
        cb.put("aa","aa");
        cb.get("aa");
        treeMap.put("aa","bb");
        ArrayList<String> aaa = new ArrayList<>();
        aaa.add("A");
        ArrayList<String> list = new ArrayList();
        list.add("Aa");
        LinkedList<String> lists = new LinkedList<>();
        lists.add("aa");
    }
}
