package com.nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname IOServer
 * @Description TODO
 * @Date 19-12-22 下午8:44
 * @Created by xns
 */
public class IOServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8000);
        /**
         * (1)接收新连接线程
         */
        new Thread(()->{
            while(true){
                try{
                    /**
                     * 阻塞方法获取新的连接
                     */
                    Socket socket = serverSocket.accept();

                    /**
                     * 每个新的连接都创建一个线程，负责读取数据
                     */
                    new Thread(()->{
                        try{
                            int len;
                            byte[] data = new byte[1024];
                            InputStream inputStream = socket.getInputStream();
                            /**
                             * 按字节流方式读取数据
                             */
                            while((len = inputStream.read(data))!=-1){
                                System.out.println(new String(data,0,len));
                            }
                        } catch (IOException e) {
                        }
                    }).start();
                }catch (IOException e){
                }
            }
        }).start();
    }
}
