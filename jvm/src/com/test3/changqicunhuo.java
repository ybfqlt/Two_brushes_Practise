package com.test3;

/**
 * @Classname changqicunhuo
 * @Description TODO
 * @Date 19-12-3 下午10:25
 * @Created by xns
 */
public class changqicunhuo {
    private static final int _1MB = 1024*1024;

    /**
     * -XX:+PrintTenuringDistribution　获得使用期的对象权
     * -XX:MaxTenuringThreshold=1
     */
    @SuppressWarnings("unused") //@SuppressWarnings("unused") 表示该属性在方法或类中没有使用。添加此注解可以去除属性上的黄色警告！！！
    public static void testTenuringThreshold(){
        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[_1MB/4];
        //什么时候进入老年代取决于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4*_1MB];
        allocation3 = new byte[4*_1MB];
        allocation3 = null;
        allocation3 = new byte[4*_1MB];
    }

    public static void main(String[] args) {
        testTenuringThreshold();
    }
}
