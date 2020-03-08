package com.ns.demo1;

import java.util.Stack;

/**
 * @Author: xns
 * @Date: 20-2-14 上午12:35
 */
class MinStack {

    /** initialize your data structure here. */

    java.util.Stack<Integer> stack;
    java.util.Stack<Integer> minstack;

    public MinStack() {
        stack = new java.util.Stack<>();
        minstack = new java.util.Stack<>();
    }

    public void push(int x) {
        if(minstack.empty()){
            minstack.push(x);
        }
        else if(x<=minstack.peek()){
            minstack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        System.out.println(stack.peek()+ "   "+minstack.peek());
        if(stack.peek().equals(minstack.peek())){
            minstack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}

class HaStack{
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}