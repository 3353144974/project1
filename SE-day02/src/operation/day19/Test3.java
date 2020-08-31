package operation.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
    public static void main(String[] args)throws Exception {
        FileInputStream fis=new FileInputStream("d:\\a\\1.png");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("d:\\bbb\\1.png");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte[] b=new byte[1024];
        int len;
        while (true){
            len=bis.read(b);
            if(len==-1){
                break;
            }
            bos.write(b);
        }
        bos.flush();
        bos.close();
        bis.close();
    }

}
