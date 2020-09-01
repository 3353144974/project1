package operation.day20.test5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) {
        Socket s= null;
        OutputStream os =null;
        try {
            s = new Socket("127.0.0.1",8888);
            Scanner sc=new Scanner(System.in);
            String s1 = sc.next();
            os = s.getOutputStream();
            os.write(s1.getBytes());
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(os!=null){
                try {
                    os.close();
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
