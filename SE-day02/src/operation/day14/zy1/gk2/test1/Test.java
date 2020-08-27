package operation.day14.zy1.gk2.test1;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> h=new HashMap<>();
        while (h.size()<5){
            String next = sc.next();
            String[] split = next.split(",");
            h.put(split[0],Integer.valueOf(split[1]));
        }
        System.out.println(h);
    }
}
