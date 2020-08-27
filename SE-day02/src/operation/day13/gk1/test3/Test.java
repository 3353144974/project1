package operation.day13.gk1.test3;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("zhangsan");
        h.add("lisi");
        h.add("wangwu");
        h.add("zhangsan");
        Iterator<String> iterator = h.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);

        }
    }

}
