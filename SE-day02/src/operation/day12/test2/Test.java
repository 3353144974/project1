package operation.day12.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s);
        }
    }

}
