package operation.day18.gk1;

import java.io.FileInputStream;

public class Test5 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("d:\\aaa\\bbb.txt");
        int len;
        byte[] b=new byte[2];
        while (true){
            len=fis.read(b);
            if(len==-1){
                break;
            }
            System.out.println(new String(b,0,len));
        }
        fis.close();
    }

}
