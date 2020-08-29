package operation.day18.gk1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test7 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("d:\\aaa\\bbb.txt");
        FileOutputStream fos=new FileOutputStream("d:\\bbb\\bbb.txt");
        int len;
        byte[] b=new byte[2];
        while (true){
            len=fis.read(b);
            if(len==-1){
                break;
            }
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }

}
