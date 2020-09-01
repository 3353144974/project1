package operation.day20.test9;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp {
    public static void main(String[] args)throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        while (true){
            FileInputStream fis=new FileInputStream("d:\\bbb\\1.png");
            OutputStream os = accept.getOutputStream();
            while (true){
                int len = fis.read();
                if(len==-1){
                    break;
                }
                os.write(len);
                os.flush();
            }
        }
    }

}
