package operation.day14.zy1.gk1.test6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Student>h=new HashMap<>();
        Student s=new Student();
        s.setAge(11);
        s.setName("ded");
        Student s1=new Student();
        s1.setAge(22);
        s1.setName("derfd");
        Student s2=new Student();
        s2.setAge(33);
        s2.setName("dreed");
        Student s3=new Student();
        s3.setAge(44);
        s3.setName("derted");
        h.put("1",s);
        h.put("2",s1);
        h.put("3",s2);
        h.put("4",s3);
        Set<String> strings = h.keySet();
        for (String string : strings) {
            System.out.println(h.get(string)+"的家是"+string);
        }
        Set<Map.Entry<String, Student>> entries = h.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.getValue()+"家是："+entry.getKey());
        }
    }
}
