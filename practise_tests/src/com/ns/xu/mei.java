package com.ns.xu;

/**
 * @Author: xns
 * @Date: 20-4-2 下午6:05
 */
public class mei {

    public static void main(String[] args) {
        Single single = Single.SINGLE;
        single.print();
    }

    enum Single{
        SINGLE;

        private Single(){

        }

        public void print(){
            System.out.println("hello world");
        }
    }
}
