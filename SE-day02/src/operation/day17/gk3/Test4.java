package operation.day17.gk3;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Test4 {
    static HashMap<Integer,String>h=new HashMap<>();
    static Integer i=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f = new File(s);
        sc(f);
        h.forEach((i,j)->System.out.println(j));
    }
    public static void sc(File file){
        h.put(i++,file.getName());
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                h.put(i++,file1.getName());
            }else {
                sc(file1);
            }
        }
    }

}
