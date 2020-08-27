package operation.As5;

import java.util.Scanner;

public class Test07 {
    public static boolean checkQQ(String qq) {
        if (qq.length() < 5 || qq.length() > 12 || qq.charAt(0) == 0) {
            return false;
        }
        char[] qqs = qq.toCharArray();
        for (int i = 0; i < qqs.length; i++) {
            if (qqs[i] < 48 || qqs[i] > 57) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("请输入一个QQ号码：");
            String s = sc.next();
            System.out.println("这个QQ号码是否正确:" + checkQQ(s));
        }
    }
}
