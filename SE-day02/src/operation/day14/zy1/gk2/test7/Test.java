package operation.day14.zy1.gk2.test7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<String,Integer>h=new HashMap<>();
        String[] str = s.split(" ");
        for (int i = 0; i <str.length ; i++) {
            if(!h.containsKey(str[i])){
                h.put(str[i],1);
            }else {
                h.put(str[i],h.get(str[i])+1);
            }
        }
        Set<String> strings = h.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next+"="+h.get(next));
        }
    }
}
