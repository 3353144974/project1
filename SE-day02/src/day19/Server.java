package day19;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("服务端启动 , 等待连接 .... ");
        ServerSocket ss = null;
        Socket server = null;
        InputStream is = null;
        try {
            ss = new ServerSocket(6666);
            server = ss.accept();
            is = server.getInputStream();
            byte[] b = new byte[1024];
            int len = is.read(b);
            String msg = new String(b, 0, len);
            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
