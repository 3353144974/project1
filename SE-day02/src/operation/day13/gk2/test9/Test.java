package operation.day13.gk2.test9;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");
        ArrayList<String> list1=new ArrayList<>();
        list1.add("e");
        list1.add("f");
        list1.add("a");
        list1.add("d");
        list1.add("g");
        HashSet<String>hs=new HashSet<>();
        for (String s:list){
            hs.add(s);
        }
        for (String s:list1){
            hs.add(s);
        }
        for (String s:hs){
            System.out.println(s);
        }
    }
}
