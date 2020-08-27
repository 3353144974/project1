package operation.day13.gk1.test6;

import java.util.ArrayList;
import java.util.Collections;

public class Tset {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(33);
        arr.add(11);
        arr.add(77);
        arr.add(55);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        for (int n:arr){
            System.out.println(n);
        }
    }
}
