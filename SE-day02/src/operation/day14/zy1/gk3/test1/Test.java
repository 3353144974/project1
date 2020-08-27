package operation.day14.zy1.gk3.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String,String>h=new HashMap<>();
        HashMap<String,String>h2=new HashMap<>();
        h.put("001","李晨");
        h.put("002","范冰冰");
        h2.put("001","马云");
        h2.put("002","马化腾");
        HashMap<String,HashMap<String,String>>h3=new HashMap<>();
        h3.put("Java基础班",h);
        h3.put("Java就业班",h2);
        Set<String> strings = h3.keySet();
        for (String string : strings) {
            System.out.println(string);
            Set<String> strings1 = h3.get(string).keySet();
            for (String s : strings1) {
                System.out.println(s+h3.get(string).get(s));
            }
        }
        Iterator<Map.Entry<String, HashMap<String, String>>> iterator = h3.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, HashMap<String, String>> next = iterator.next();
            System.out.println(next.getKey());
            Iterator<Map.Entry<String, String>> iterator1 = next.getValue().entrySet().iterator();
            while (iterator1.hasNext()) {
                Map.Entry<String, String> next1 = iterator1.next();
                System.out.println(next1.getKey()+next1.getValue());
            }
        }
    }
}
