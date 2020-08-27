package operation.day13.gk3.test2;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> hs=new HashSet<>();
        HashSet<Student> hs2=new HashSet<>();
        HashSet<HashSet> hs3=new HashSet<>();
        Student stu=new Student("孔丘明",120);
        Student stu1=new Student("孟子",120);
        Student stu2=new Student("老子",120);
        Student stu3=new Student("庄子",120);
        hs.add(stu);
        hs.add(stu1);
        hs2.add(stu2);
        hs2.add(stu3);
        hs3.add(hs);
        hs3.add(hs2);
        Iterator<HashSet> iterator = hs3.iterator();
        while (iterator.hasNext()) {
            HashSet next = iterator.next();
            Iterator iterator1 = next.iterator();
            while (iterator1.hasNext()) {
                Object next1 = iterator1.next();
                System.out.println(next1);
            }
        }
        for (HashSet<Student> h:hs3){
            for (Student s:h){
                System.out.println(s);
            }
        }

    }
}
