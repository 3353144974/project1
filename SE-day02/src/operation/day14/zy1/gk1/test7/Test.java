package operation.day14.zy1.gk1.test7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Student,String> h=new HashMap<>();
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
        h.put(s,"1");
        h.put(s1,"2");
        h.put(s2,"3");
        h.put(s3,"4");
        Set<Student> strings = h.keySet();
        for (Student string : strings) {
            System.out.println(string+"的家是"+h.get(string));
        }
        Set<Map.Entry<Student, String>> entries = h.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+"家是："+entry.getValue());
        }
    }
}
