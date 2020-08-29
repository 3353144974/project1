package operation.day18.gk1;

import java.io.FileInputStream;

public class Test4 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("d:\\aaa\\bbb.txt");
        int len;
        while (true){
            len=fis.read();
            if(len==-1){
                break;
            }
            System.out.println((char) len);
        }
        fis.close();
    }

}
