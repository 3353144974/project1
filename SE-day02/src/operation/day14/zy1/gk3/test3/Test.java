package operation.day14.zy1.gk3.test3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        Random r=new Random();
        while (set.size() < 4) {
            String str = "";
            for (int i = 0; i < 8; i++) {
                int j = r.nextInt(9);
                str+=j;
            }
            set.add(Integer.valueOf(str));
        }
        HashMap<Integer,String>h=new HashMap<>();
        Integer next = set.iterator().next();
        h.put(next,"苹果");
        Integer next2 = set.iterator().next();
        h.put(next2,"香蕉");
        Integer nex3 = set.iterator().next();
        h.put(nex3,"西瓜");
        Integer nex4 = set.iterator().next();
        h.put(nex4,"橘子");
        System.out.println("请输入8个0-9的商品号：");
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        if (h.containsKey(i)) {
            System.out.println("根据商品号："+i+"查询到对应的商品为：" + h.get(i));
        }else {
            System.out.println("查无此商品");
        }
    }
}
