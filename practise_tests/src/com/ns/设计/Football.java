package com.ns.设计;

/**
 * @Author: xns
 * @Date: 20-4-10 下午9:08
 */
public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Started.Enjoy the game!");
    }
}
