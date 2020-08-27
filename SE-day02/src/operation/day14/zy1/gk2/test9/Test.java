package operation.day14.zy1.gk2.test9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Double>h=new HashMap<>();
        h.put("Java",32.5);
        h.put("C++",25.0);
        h.put("PHP",28.6);
        h.put("UI",21.3);
        h.put("Python",10.2);
        h.remove("C++");
        h.put("Java",38.5);
        Set<String> strings = h.keySet();
        for (String string : strings) {
            System.out.println(string+":"+h.get(string)+"元");
        }
        Set<Map.Entry<String, Double>> entries = h.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue()+"元");
        }
    }
}
