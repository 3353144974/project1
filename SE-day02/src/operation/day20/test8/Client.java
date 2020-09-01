package operation.day20.test8;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("192.168.1.102",8888);
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw=new OutputStreamWriter(os);
        BufferedWriter bw=new BufferedWriter(osw);
        bw.write(s);
        bw.newLine();
        bw.flush();
    }

}
