package operation.day20.test9;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("192.168.1.102",8888);
        InputStream is = socket.getInputStream();
        BufferedInputStream bis=new BufferedInputStream(is);
        FileOutputStream fos=new FileOutputStream("d:\\a\\1.png");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        while (true){
            int read = bis.read();
            if(read==-1){
                break;
            }
            bos.write(read);
            bos.flush();
        }
    }

}
