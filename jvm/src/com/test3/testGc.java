package com.test3;

/**
 * @Classname testGc
 * @Description TODO
 * @Date 19-12-3 下午9:49
 * @Created by xns
 */
public class testGc {
    private static final int _1MB = 1024* 1014;

    /**
     * -verbose:gc  在控制台输出GC情况
     * -Xms20M 堆最小为20M
     * -Xmx20M 堆最大为20M 将堆最大和最小设置成一样，可避免自动扩展
     * -Xmn10M 设置年轻代大小为10M
     * -XX:+PrintGCDetails 在控制台输出详细的GC情况
     * -XX:SurvivorRatio=8 新生代中Eden区域与Survivor区域的容量比值，默认为8，代表Eden:Survivor=8:1
     */
    public static void testAllocation(){
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation4 = new byte[4*_1MB];
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
