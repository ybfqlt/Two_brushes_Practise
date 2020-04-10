package com.ns.wenjain;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
 
/**
 * @program: ImportantNotDelete
 * @Date: 2018-09-02 20:28
 * @Author: 夜~星空
 * @Description:客户端：使用套接字进行文件下载
 */
public class Download_Client {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataInputStream dateInputStream=null;
        DataOutputStream dataOutputStream=null;
        DataOutputStream localWrite=null;
        Socket socket=null;
        try {
            socket=new Socket("127.0.0.1",9992);
            //输入流
            dateInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            //输出流
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            System.out.println("请输入文件路径:");
            String filePath = in.next();
            dataOutputStream.writeUTF(filePath);
            dataOutputStream.flush();
 
            String fileName = dateInputStream.readUTF();
            String length=dateInputStream.readUTF();
            System.out.println("文件名："+fileName+"    文件大小："+length);
            localWrite=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/home/ltt/aaa/"+fileName)));
            byte[] bytes=new byte[4096];
            while (true){
                int read=0;
                if(dataOutputStream!=null){
                    read = dateInputStream.read(bytes);
                }
                if(read==-1){
                    break;
                }
                localWrite.write(bytes,0,read);
                localWrite.flush();
            }
            System.out.println("文件下载完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            in.close();
            try {
                localWrite.close();
                dataOutputStream.close();
                dateInputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
 
        }
 
    }
 
}