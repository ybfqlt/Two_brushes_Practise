package com.ns.wenjain;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Upload_Client {
    public static void main(String[] args) throws Exception {
        // 1. 提示输入要上传的文件路径，验证路径是否存在以及是否是文件夹
        File file = getFile();
        // 2. 发送文件到服务器
        Socket socket = new Socket("127.0.0.1", 6666);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());
        ps.println(file.getName());
        // 6. 接收结果，如果存在给予提示，程序直接退出
        String result = br.readLine();// 读取结果
        if ("文件存在".equals(result)) {
            System.out.println("文件已经存在");
            socket.close();
            return;
        } else {
            // 7. 不存在，定义FileInputStream读取文件，写出到网络
            FileInputStream fis = new FileInputStream(file);
            byte[] arr = new byte[8192];
            int len;
            while ((len = fis.read(arr)) != -1) {
                ps.write(arr, 0, len);
            }
            fis.close();
            socket.close();
        }
    }

    /**
     * 获取文件对象
     * 
     * @return File
     */
    private static File getFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径：");
    
        while (true) {
            String line = sc.nextLine();
            File file = new File(line);
            if (!file.exists()) {
                System.out.println("路径不存在");
            } else if (file.isDirectory()) {
                System.out.println("必须是文件");
            } else {
                return file;
            }
        }
    }
}