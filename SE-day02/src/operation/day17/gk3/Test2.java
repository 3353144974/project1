package operation.day17.gk3;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        File f=new File(s);
        sc(f);
    }
    public static void sc(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                file1.delete();
            }else {
                sc(file1);
            }
            file1.delete();
        }
        file.delete();
    }

}
