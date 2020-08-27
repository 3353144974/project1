package operation.day12.test4;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("xiaomi");
        list.add("xiaomi2");
        list.add("xiaomi3");
        list.add("xiaomi4");
        for (String a:list){
            System.out.println(a);
        }
    }
}
