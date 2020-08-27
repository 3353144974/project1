package operation.day13.gk2.test7;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<Character> link=new LinkedHashSet<>();
        String str=sc.nextLine();
        char[] chars = str.toCharArray();
        for (char c:chars){
            link.add(c);
        }
        for (char a:link){
            System.out.println(a);
        }
    }
}
