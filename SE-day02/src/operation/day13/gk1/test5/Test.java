package operation.day13.gk1.test5;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<String>link=new LinkedHashSet<>();
        link.add("王昭君");
        link.add("王昭君");
        link.add("西施");
        link.add("杨玉环");
        link.add("貂蝉");
        Iterator<String> iterator = link.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        for (String a:link){
            System.out.println(a);
        }
    }
}
