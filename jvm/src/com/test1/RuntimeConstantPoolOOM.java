package com.test1;

/**
 * @Classname RuntimeConstantPoolOOM
 * @Description TODO
 * @Date 19-11-26 下午7:52
 * @Created by xns
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern()==str2);
    }
}