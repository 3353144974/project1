package operation.day12.test1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.remove("1");
        list.remove("2");
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
