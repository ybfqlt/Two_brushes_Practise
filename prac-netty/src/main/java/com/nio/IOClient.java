package com.nio;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @Classname IOClient
 * @Description TODO
 * @Date 19-12-22 下午9:48
 * @Created by xns
 */
public class IOClient {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();
    }
}
