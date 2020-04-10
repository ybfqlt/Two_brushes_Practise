package com.ns.设计;

/**
 * @Author: xns
 * @Date: 20-4-10 下午9:08
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
