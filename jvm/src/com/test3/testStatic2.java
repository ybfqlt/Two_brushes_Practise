package com.test3;

/**
 * @Classname testStatic2
 * @Description TODO
 * @Date 19-11-27 下午6:31
 * @Created by xns
 */
class Base{
    static{
        System.out.println("base static");
    }

    public Base(){
        System.out.println("base constructor");
    }
}

public class testStatic2 extends Base {
    static{
        System.out.println("testStatic2 static");
    }

    public testStatic2(){
        System.out.println("testStatic2 constructor");
    }

    public static void main(String[] args) {
        new testStatic2();
    }
}
