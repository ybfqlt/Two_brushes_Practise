package com.ns.wenjain;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
 
/**
 * @program: ImportantNotDelete
 * @Date: 2018-09-02 20:47
 * @Author: 夜~星空
 * @Description:服务器端：使用套接字实现文件下载功能
 */
public class Server {
 
    public static void main(String[] args) {
 
        try {
            int i=0;
            ServerSocket serverSocket=new ServerSocket(9992);
            while(true){
                System.out.println("服务器已启动！");
                Socket socket =serverSocket.accept();
                Thread thread=new Thread(new ThreadHandler(socket),"Thread-"+i++);
                thread.start();
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
class ThreadHandler implements Runnable {
    private Socket socket;
 
    public ThreadHandler(Socket socket) {
        this.socket = socket;
    }
 
    @Override
    public void run() {
        DataOutputStream dataOutputStream=null;
        DataInputStream dataInputStream=null;
        DataInputStream localRead =null;
        try {
            dataOutputStream=new DataOutputStream(socket.getOutputStream());
            dataInputStream=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
 
            String filePath = dataInputStream.readUTF();
            File file=new File(filePath);
            //判断文件是否存在
            if(!file.exists()){
                return;
            }else{
                //文件名
                String fileName = file.getName();
                dataOutputStream.writeUTF(fileName);
                dataOutputStream.flush();
                //文件大小
                long length = file.length();
                dataOutputStream.writeUTF(String.valueOf(length));
                dataOutputStream.flush();
 
                System.out.println("开始向 "+Thread.currentThread().getName()+
                        " 发送文件，文件名："+fileName+"  文件大小"+length);
                localRead =new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                byte[] bytes=new byte[4096];
                while (true){
                    int read=0;
                    if(localRead!=null){
                        read = localRead.read(bytes);
                    }
                    if(read==-1){
                        break;
                    }
                    dataOutputStream.write(bytes,0,read);
                    dataOutputStream.flush();
                }
                System.out.println("向 "+Thread.currentThread().getName()+" 发送文件完毕！");
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                localRead.close();
                dataOutputStream.close();
                dataInputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}