package operation.day18.gk1;

import java.io.FileOutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("d:\\bbb\\bbb.txt",true);
        for (int i = 0; i < 5; i++) {
            fos.write("i love java\r\n".getBytes());
        }
        fos.close();
    }

}
