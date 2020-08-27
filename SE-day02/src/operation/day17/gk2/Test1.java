package operation.day17.gk2;

import java.io.File;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        File f=new File(s);
        if(f.exists()){
            System.out.println(f.length());
        }else {
            f.createNewFile();
        }
    }

}
