package com.ns.设计;

/**
 * @Author: xns
 * @Date: 20-4-10 下午9:07
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
