package com.ns.设计;

/**
 * @Author: xns
 * @Date: 20-4-10 下午9:07
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Finished");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized! Start playing");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Started.Enjoy the game");
    }
}
