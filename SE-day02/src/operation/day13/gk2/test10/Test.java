package operation.day13.gk2.test10;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> h=new HashSet<>();
        Student stu=new Student("小红",20,27);
        Student stu2=new Student("小红2",21,26);
        Student stu3=new Student("小红3",22,27);
        Student stu4=new Student("小红4",23,28);
        Student stu5=new Student("小红5",24,29);
        h.add(stu);
        h.add(stu2);
        h.add(stu3);
        h.add(stu4);
        h.add(stu5);
        Student next = h.iterator().next();
        double sum=0;
        double max=next.getScore();
        double min=next.getScore();
        for (Student s:h){
            sum+=s.getScore();
            if(max<s.getScore()){
                max=s.getScore();
            }
            if(min>s.getScore()){
                min=s.getScore();
            }
        }
        System.out.println(sum);
        System.out.println((sum/h.size()));
        System.out.println(max);
        System.out.println(min);
    }
}
