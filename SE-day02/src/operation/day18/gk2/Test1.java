package operation.day18.gk2;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("d:\\aaa\\ccc.txt");
        Scanner sc=new Scanner(System.in);
        while (true){
            String next = sc.next();
            if("end".equals(next)){
                break;
            }
            next+="\r\n";
            fos.write(next.getBytes());
        }
        fos.close();
    }
}
