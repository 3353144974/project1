package operation.day13.gk2.test1;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        HashSet<String> h=new HashSet<>();
        h.addAll(list);
        list.clear();
        list.addAll(h);
        for (String a:list){
            System.out.println(a);
        }
    }
}
