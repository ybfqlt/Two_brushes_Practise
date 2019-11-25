package com.test1;

/**
 * @Classname Test
 * @Description 栈内存溢出
 * @Date 19-11-25 下午7:43
 * @Created by xns
 */
public class StackTest {

    private void test(){
        System.out.println("方法执行...");
        test();
    }

    public static void main(String[] args) {
        new StackTest().test();
    }
}
