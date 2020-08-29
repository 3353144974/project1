package operation.day18.gk2;

import java.io.FileInputStream;

public class Test3 {
    public static void main(String[] args) {
        try {
            cs('z');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void cs(char ch)throws Exception{
        FileInputStream fis=new FileInputStream("d:\\aaa\\bbb.txt");
        int len;
        int i=0;
        while (true){
            len=fis.read();
            if (len==-1){
                break;
            }
            if (len==ch){
                i++;
            }
        }
        System.out.println(ch+"出现"+i+"次");
    }

}
