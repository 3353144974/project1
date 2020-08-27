package operation.day14.zy1.gk2.test4;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!h.containsKey(chars[i])) {
                h.put(chars[i], 1);
            } else {
                h.put(chars[i],h.get(chars[i])+1);
            }
        }
        System.out.println(h);
    }
}
