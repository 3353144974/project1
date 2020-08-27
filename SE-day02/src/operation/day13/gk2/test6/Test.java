package operation.day13.gk2.test6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        Random r=new Random();


        while (hs.size()<=10){
            int i = r.nextInt(20) + 1;
            hs.add(i);
        }
        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
