package operation.day18.gk1;


import java.io.FileWriter;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("d:\\aaa\\ddd.txt");
        Scanner sc=new Scanner(System.in);
        while (true){
            String s = sc.next();
            if("886".equals(s)){
                break;
            }
            fw.write(s+"\r\n");
            fw.flush();
        }
        fw.close();
    }

}
