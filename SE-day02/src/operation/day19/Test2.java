package operation.day19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("d:\\a\\a.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        String str="dfbamsrga";
        byte[] bytes = str.getBytes();
        bos.write(bytes);
        bos.flush();
        bos.close();
    }

}
