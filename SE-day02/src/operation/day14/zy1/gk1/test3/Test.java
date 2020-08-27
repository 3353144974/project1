package operation.day14.zy1.gk1.test3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"kugyj");
        hashMap.put(2,"kugyj");
        hashMap.put(3,"kugyj");
        hashMap.put(4,"kugyj");
        hashMap.put(5,"kugyj");
        hashMap.put(6,"kugyj");
        hashMap.put(7,"kugyj");
        Collection<String> values = hashMap.values();
        for (String i:values){
            System.out.println(i);
        }
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
