package Saturday;

import java.util.Scanner;

public class Lianxi10 {
    public static void main(String[] args) {
        int num1 = (int) ((Math.random() * 10));
        System.out.println("请输入0-10：");
        for (int i = 3; i >=1; i++) {
            System.out.println("请重新输入0-10：");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num == num1) {
                System.out.println("恭喜你猜中了！");
            } else {
                System.out.println("很遗憾猜错了。还有"+i+"次机会");
            }
        }

    }
}
