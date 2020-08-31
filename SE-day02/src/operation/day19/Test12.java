package operation.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test12 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("d:\\a\\a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\a\\b.txt"));
        String len=null;
        while (true){
            len=br.readLine();
            if(len==null){
                break;
            }
            bw.write(len);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        BufferedReader br2=new BufferedReader(new FileReader("d:\\a\\b.txt"));
        String str=null;
        while (true){
            str=br2.readLine();
            if(str==null){
                break;
            }
            System.out.println(str);
        }
        br2.close();
    }

}
