package operation.day20.test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Tcp {
    public static void main(String[] args) {
        System.out.println("服务端启动 , 等待连接 .... ");
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(7777);
            Socket server = ss.accept();
            while (true){
                InputStream is = server.getInputStream();
                InputStreamReader isr=new InputStreamReader(is);
                BufferedReader br=new BufferedReader(isr);
                String line = br.readLine();
                System.out.println("客户端接收"+line);
                if ("exit".equals(line)) {
                    System.out.println("服务器端发送exit到客户端");
                    return;
                }
                Scanner sc=new Scanner(System.in);
                String s = sc.next();
                OutputStream os = server.getOutputStream();
                OutputStreamWriter osw=new OutputStreamWriter(os);
                BufferedWriter bw=new BufferedWriter(osw);
                bw.write(s);
                bw.newLine();
                bw.flush();
                if ("exit".equals(s)) {
                    osw.close();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
