package operation.day18.gk1;

import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("d:\\aaa\\bbb.txt");
        fos.write(99);
        fos.close();
    }
}
