package com.ns.xu;

/**
 * @Author: xns
 * @Date: 20-4-2 下午5:43
 */
public class neibuSigleton {
    private static neibuSigleton neibu = null;

    private static class StaticneibuSigleton{
        private static final com.ns.xu.neibuSigleton instance = new com.ns.xu.neibuSigleton();
    }

    public static neibuSigleton neibuSigleton(){
        return StaticneibuSigleton.instance;
    }
}
