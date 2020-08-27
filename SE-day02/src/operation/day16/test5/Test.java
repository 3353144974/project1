package operation.day16.test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> h=new ArrayList<>();
        h.add(new Student("小明1",60));
        h.add(new Student("小明2",40));
        h.add(new Student("小明3",20));
        h.add(new Student("小明4",80));
        h.add(new Student("小明5",100));
        Collections.sort(h,(n1,n2)->n1.getScore()-n2.getScore());
        for (Student student : h) {
            System.out.println(student.getName()+student.getScore());
        }
    }

}
