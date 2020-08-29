package day18;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        HashMap<Character,Integer>h=new HashMap<>();
        for (char d : c) {
            if(!h.containsKey(d)){
                h.put(d,1);
            }else {
                h.put(d,h.get(d)+1);
            }
        }
        System.out.println(h);
    }

}
