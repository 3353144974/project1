package operation.day14.zy1.gk2.test5;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        HashMap<String, Integer> h = new HashMap<>();
        for (char c : ch) {
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                countingKey(h, "字母");
            } else if (c == ' ') {
                countingKey(h, "空格");
            } else if (c >= '0' && c <= '9') {
                countingKey(h, "数字");
            } else {
                countingKey(h, "其他字符");
            }
        }
        System.out.println(h);
    }

    public static void countingKey(HashMap<String, Integer> map, String key) {
        if (!map.containsKey(key)) {
            map.put(key, 1);
        } else {
            map.put(key, (map.get(key) + 1));
        }
    }
}
