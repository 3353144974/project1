package operation.day13.gk3.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        while (hs.size()<=5){
            int i = r.nextInt(33) + 1;
            hs.add(i);
        }
        list.addAll(hs);
        Collections.sort(list);
        int i = r.nextInt(16) + 1;
        list.add(i);
        System.out.println(list);

    }

}
