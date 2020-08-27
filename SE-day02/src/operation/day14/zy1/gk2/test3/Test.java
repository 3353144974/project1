package operation.day14.zy1.gk2.test3;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String>h=new HashMap<>();
        h.put(1,"张三丰");
        h.put(2,"周芷若");
        h.put(3,"汪峰");
        h.put(4,"灭绝师太");
        System.out.println(h);
        h.put(5,"李晓红");
        h.remove(1);
        h.put(2,"周林");
        System.out.println(h);
    }
}
