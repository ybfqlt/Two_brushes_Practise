package com.test1;

import sun.misc.PostVMInitHook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Classname Mian
 * @Description TODO
 * @Date 19-11-25 下午5:58
 * @Created by xns
 */
public class Main extends JFrame {
    private JButton jb;

    public Main(){
        this.setBounds(200,200,400,200);
        this.setTitle("lambda测试");
        jb = new JButton("click");
//        jb.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("hello");
//            }
//        });
        jb.addActionListener(event->System.out.println("Hello"));

        this.add(jb);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Main a = new Main();
    }
}
