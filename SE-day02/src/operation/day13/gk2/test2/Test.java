package operation.day13.gk2.test2;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("张三");
        h.add("李四");
        h.add("王五");
        h.add("二丫");
        h.add("钱六");
        h.add("孙七");
        System.out.println(h);
        h.remove("二丫");
        h.add("王小丫");
        System.out.println(h);
    }
}
