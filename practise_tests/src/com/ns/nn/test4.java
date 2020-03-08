package com.ns.nn;

import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: xns
 * @Date: 20-3-2 下午8:08
 */
class Que {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
        System.out.println(stack1+"jfdfd");
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("a","a");
    }

    public int pop() {
        System.out.println(stack1.size()+"{{{{");
        for(int i=0;i<stack1.size()-1;i++){
            stack2.push(stack1.pop());
            System.out.println("stack21"+stack1);
            System.out.println("stack2"+stack2);
        }
        int a = stack1.pop();
        System.out.println(a+">>>>"+stack2.size());
        for(int i=0;i<stack2.size();i++){
            stack1.push(stack2.pop());
            System.out.println("stack1"+stack1);
        }
        return a;
    }
}

public class test4{
    public static void main(String[] args) {
        Que que = new Que();
        que.push(1);
        que.push(2);
        que.push(3);
        System.out.println(que.pop());
        System.out.println(que.pop());
        que.push(4);
        System.out.println(que.pop());
        que.push(5);
        System.out.println(que.pop());
        System.out.println(que.pop());

    }
}
