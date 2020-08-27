package operation.day14.zy1.gk1.test4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("邓超", "孙俪");
        hashMap.put("李晨", "范冰冰");
        hashMap.put("刘德华", "柳岩");
        hashMap.put("黄晓明", " Baby");
        hashMap.put("谢霆锋", "张柏芝");
        Set<String> strings = hashMap.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            String s = hashMap.get(next);
            System.out.println(next+"->"+s);
        }
    }
}
