package operation.day20.test6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.1.102",7777);
            while (true){
                Scanner sc=new Scanner(System.in);
                String s = sc.next();
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw=new OutputStreamWriter(os);
                BufferedWriter bw=new BufferedWriter(osw);
                bw.write(s);
                bw.newLine();
                bw.flush();
                if ("exit".equals(s)) {
                    os.close();
                    return;
                }
                InputStream is=socket.getInputStream();
                InputStreamReader isr=new InputStreamReader(is);
                BufferedReader br=new BufferedReader(isr);
                String line = br.readLine();
                System.out.println("服务器端接收:" + line);
                if ("exit".equals(line)) {
                    System.out.println("服务器端发送exit到客户端");
                    return;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
