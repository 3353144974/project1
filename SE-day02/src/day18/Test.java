package day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        try {
            fr=new FileReader("d:\\aaa\\ddd.txt");
            fw=new FileWriter("D:\\bbb\\ddd.txt");
            int len;
            char[] ch=new char[2];
            while (true){
                len=fr.read(ch);
                if(len==-1){
                    break;
                }
                fw.write(ch);
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
