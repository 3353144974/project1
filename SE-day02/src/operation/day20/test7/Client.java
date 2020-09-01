package operation.day20.test7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                Socket socket = new Socket("localhost", 8888);
                FileInputStream fis=new FileInputStream("d:\\bbb\\bbb.txt");
                BufferedInputStream bis=new BufferedInputStream(fis);
                OutputStream os = socket.getOutputStream();
                byte[] b = new byte[1024 * 8];
                int len;
                while ((len = bis.read(b)) != -1) {
                    os.write(b, 0, len);
                }
                os.flush();
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
