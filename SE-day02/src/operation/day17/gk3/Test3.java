package operation.day17.gk3;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Test3 {
    static  HashMap<String, Integer> h = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File f = new File(s);
        sc(f);
        h.forEach((i,j)->{
            System.out.println(i+"类型出现"+j+"次");
        });
    }

    //pathname.getName().endsWith(".java")
    public static void sc(File file) {
        int z=0;
        int sum=0;
        File[] files = file.listFiles();
        sum+=files.length;
        for (File file1 : files) {
            if (file1.isDirectory()) {
                sum+=file1.length();
                sc(file1);
            } else {
                String[] split = file1.getName().split("\\.");
                if (!h.containsKey(split[1])) {
                    h.put(split[1], 1);
                } else {
                    h.put(split[1], h.get(split[1]) + 1);
                }
            }
            z++;
        }

    }

}
