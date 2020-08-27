package operation.day14.zy1.gk1.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1,"kugyj");
        hashMap.put(2,"kugyj");
        hashMap.put(3,"kugyj");
        hashMap.put(4,"kugyj");
        hashMap.put(5,"kugyj");
        hashMap.put(6,"kugyj");
        hashMap.put(7,"kugyj");
        Set<Integer> keySet = hashMap.keySet();
        for (Integer i:keySet){
            System.out.println(i);
        }
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
