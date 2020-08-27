package operation.day14.zy1.gk2.test2;

import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap<>();
        h.put("柳岩",2100);
        h.put("张亮",1700);
        h.put("诸葛亮",1800);
        h.put("灭绝师太",2600);
        h.put("东方不败",3800);
        System.out.println(h);
        h.put("柳岩",h.get("柳岩")+300);
        Set<String> s = h.keySet();
        for (String i : s) {
            System.out.println(h.get(i)+"="+i);
        }
    }
}
