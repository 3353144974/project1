package operation.day14.zy1.gk2.test6;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("dsfsrf");
        list.add("ujhncnh");
        HashMap<Character,Integer>map=new HashMap<>();
        for (String s : list) {
            char[] c = s.toCharArray();
            for (char d : c) {
                if(!map.containsKey(d)){
                    map.put(d,1);
                }else {
                    map.put(d,map.get(d)+1);
                }
            }
        }
        System.out.println(map);
    }
}
