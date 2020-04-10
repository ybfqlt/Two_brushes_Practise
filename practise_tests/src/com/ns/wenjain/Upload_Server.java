package com.ns.wenjain;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Upload_Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        // 接收上传的文件
        while (true) {
            final Socket socket = ss.accept();// 接收请求
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintStream ps = new PrintStream(socket.getOutputStream());
            new Thread() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        PrintStream ps = new PrintStream(socket.getOutputStream());
                        String fileName = br.readLine(); // 读取文件名
                        File dir = new File("cache");
                        dir.mkdir();
                        File file = new File(dir, fileName);
                    
                        // 5. 判断文件是否已经存在
                        if (file.exists()) {
                            ps.println("文件存在");
                            socket.close();
                            return;
                        } else {
                            ps.println("不存在");
                        }
                    
                        // 8. 定义FileOutputStream，从网络读取数据，存储到本地
                        FileOutputStream fos = new FileOutputStream(file);
                        byte[] arr = new byte[8192];
                        int len;
                    
                        while ((len = is.read(arr)) != -1) {
                            fos.write(arr, 0, len);
                        }
                        fos.close();
                        socket.close();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}