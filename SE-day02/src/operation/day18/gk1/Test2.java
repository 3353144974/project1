package operation.day18.gk1;

import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("d:\\aaa\\bbb.txt");
        fos.write(new byte[]{99,98,100,120});
        fos.close();
    }

}
