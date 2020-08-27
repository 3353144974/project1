package operation.day11.test7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("       欢迎使用超市购物系统");
        Select();
        boolean condition = true;
        while (condition) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == 3) {
                System.out.println("感谢您使用超市购物系统，欢迎下次光临，拜拜");
                condition = false;
            } else {
                Operation(i, list);
            }
        }
    }

    public static void Select() {
        System.out.println("请输入你要进行的操作：");
        System.out.println("1:购买商品        2:结算并打印小票  3:退出系统");
    }

    public static ArrayList<String> Operation(int i, ArrayList<String> list) {
        if (i == 1) {
            list = Commodity(list);
            Select();
        }
        if (i == 2) {
            System.out.println("-------------------------------------------");
            System.out.println("欢迎光临");
            System.out.println("名称      售价      数量      金额");
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).substring(0, 3).equals("001")) {
                    num1 += Integer.valueOf(list.get(j).substring(4));
                }
                if (list.get(j).substring(0, 3).equals("002")) {
                    num2 += Integer.valueOf(list.get(j).substring(4));
                }
                if (list.get(j).substring(0, 3).equals("003")) {
                    num3 += Integer.valueOf(list.get(j).substring(4));
                }
                if (list.get(j).substring(0, 3).equals("004")) {
                    num4 += Integer.valueOf(list.get(j).substring(4));
                }
            }
            boolean a = true;
            boolean a1 = true;
            boolean a2 = true;
            boolean a3 = true;
            int s = 0;
            double sum = 0;
            int avg = 0;
            for (int i1 = 0; i1 < list.size(); i1++) {
                if (list.get(i1).substring(0, 3).equals("001")) {
                    if (a) {
                        System.out.println("少林核桃  15.5       " + num1 + "        " + ((double) (num1 * 15.5)));
                        a = false;
                        s += 1;
                        avg += num1;
                        sum += ((double) (num1 * 15.5));
                    }
                }
                if (list.get(i1).substring(0, 3).equals("002")) {
                    if (a1) {
                        System.out.println("尚康饼干  14.5       " + num2 + "        " + ((double) (num2 * 14.5)));
                        a1 = false;
                        s += 1;
                        avg += num2;
                        sum += ((double) (num2 * 14.5));
                    }
                }
                if (list.get(i1).substring(0, 3).equals("003")) {
                    if (a2) {
                        System.out.println("移动硬盘  345.0      " + num3 + "        " + ((double) (num3 * 345.0)));
                        a2 = false;
                        s += 1;
                        avg += num3;
                        sum += ((double) (num3 * 345.0));
                    }
                }
                if (list.get(i1).substring(0, 3).equals("004")) {
                    if (a3) {
                        System.out.println("高清无码  199.0      " + num4 + "        " + ((double) (num4 * 199.0)));
                        a3 = false;
                        s += 1;
                        avg += num4;
                        sum += ((double) (num4 * 199.0));
                    }
                }
            }
            System.out.println("-------------------------------------------");
            System.out.println(s + "项商品");
            System.out.println("共计：" + avg + "件");
            System.out.println("共:" + sum + "元");
            System.out.println("-------------------------------------------");
            Select();
        }
        return list;
    }

    public static ArrayList<String> Commodity(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("        商品列表");
        System.out.println("商品id    名称      单价      计价单位");
        System.out.println("001      少林核桃   15.5      斤");
        System.out.println("002      尚康饼干   14.5      包");
        System.out.println("003      移动硬盘   345.0     个");
        System.out.println("004      高清无码   199.0     G");
        System.out.println("-------------------------------------------");
        System.out.println("请输入你要购买的商品项(输入格式：商品id-购买数量)，输入end表示购买结束。");
        boolean a = true;
        while (a) {
            String str = sc.next();
            if (str.substring(0, 3).equals("end")) {
                a = false;
            } else if (str.length() >= 5) {
                if (str.substring(0, 3).equals("001") || str.substring(0, 3).equals("002") || str.substring(0, 3).equals("003") || str.substring(0, 3).equals("004")) {
                    list.add(str);
                } else {
                    System.out.println("你输入的商品id不存在请重新输入!!");
                    continue;
                }
            } else {
                System.out.println("你输入的购买姿势不对，请换个姿势再来一次(格式：商品id-购买数量)");
            }
        }
        return list;
    }
}
