package operation.day18.gk3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class test1 {
    static Integer i=1;
    static HashMap<String,File>h=new HashMap<>();
    static String name;
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f=new File(s);
        File fs=new File("d:\\a");
        printDir2(fs);
        printDir(f);
        sc(fs);
    }
    public static void sc(File f){
        h.forEach((i,s)->{
            FileInputStream fis= null;
            FileOutputStream fos= null;
            try {
                fis = new FileInputStream(s);
                String ss = f.getAbsolutePath();
                ss+="\\"+i;
                fos = new FileOutputStream(ss);
                int len;
                byte[] b=new byte[2];
                while (true){
                    len=fis.read(b);
                    if(len==-1){
                        break;
                    }
                    fos.write(b,0,len);
                }
                fos.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    public static void printDir(File file) {
        File[] files = file.listFiles(f->f.getName().endsWith(".java") || f.isDirectory());
        for (File file1 : files) {
            if (file1.isFile()) {
                name = file1.getName();
                if(h.containsKey(name)){
                    String[] split = file1.getName().split("\\.");
                    while (true){
                        name=split[0]+i+"."+split[1];
                        if(!list.contains(name)){
                            list.add(name);
                            h.put(name,file1);
                            break;
                        }
                    }
                    i++;
                }
                h.put(name,file1);
            } else {
                printDir(file1);
            }
        }
    }
    public static void printDir2(File file) {
        File[] files2 = file.listFiles(f->f.getName().endsWith(".java") || f.isDirectory());
        for (File file1 : files2) {
            if (file1.isFile()) {
                String name = file1.getName();
                list.add(name);
                h.put(name,file1);
            } else {
                printDir(file1);
            }
        }
    }

}
