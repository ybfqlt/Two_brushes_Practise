package com.test3;

/**
 * @Classname test
 * @Description TODO
 * @Date 19-11-27 下午6:25
 * @Created by xns
 */
public class testStatic1 {
    /**
     * static是被左右对象所享有的
     */
    static int value = 33;

    private void printValue(){
        int value = 3;
        System.out.println(this.value);
    }

    public static void main(String[] args)throws Exception{
        new testStatic1().printValue();
    }
}
