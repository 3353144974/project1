package operation.day18.gk1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test6 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("d:\\aaa\\bbb.txt");
        FileOutputStream fos=new FileOutputStream("d:\\bbb\\bbb.txt");
        int len;
        while (true){
            len=fis.read();
            if(len==-1){
                break;
            }
            fos.write(len);
        }
        fos.close();
        fis.close();
    }

}
