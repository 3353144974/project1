package operation.day19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("d:\\a\\a.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        bos.write(99);
        bos.flush();
        bos.close();

    }

}
