package com.test1;

/**
 * @Classname test
 * @Description TODO
 * @Date 19-11-25 下午9:04
 * @Created by xns
 */
public class test {
    public static void main(String[] args) {
        /**
         * 字节码常量
         */
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);

        String s3 = new String("abc");
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3.intern());
    }
}
