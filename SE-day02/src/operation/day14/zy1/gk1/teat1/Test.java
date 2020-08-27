package operation.day14.zy1.gk1.teat1;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"3513");
        map.put(2,"3523");
        map.put(3,"3453");
        map.put(4,"3353");
        System.out.println(map);
        map.put(1,"353583");
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.remove(2));
        System.out.println(map);
    }
}
