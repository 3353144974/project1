package operation.day16.test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Collections.addAll(arr, 5, 222, 1,2);
        HashSet<Integer> hashSet=new HashSet<>();
        Collections.addAll(hashSet, 5, 222, 1,2);
        HashMap<Integer,String>h=new HashMap<>();
        h.put(1,"小明1");
        h.put(2,"小明2");
        h.put(3,"小明3");
        h.put(4,"小明4");
        h.put(5,"小明5");
        arr.forEach(n->System.out.println(n));
        hashSet.forEach(h1-> System.out.println(h1));
        h.forEach((i,s)-> System.out.println(i+"---"+s));
    }

}
