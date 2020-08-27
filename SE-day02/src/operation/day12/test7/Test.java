package operation.day12.test7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student stu1=new Student("小明1",88,59.5);
        Student stu2=new Student("小明2",87,60.0);
        Student stu3=new Student("小明3",86,60.5);
        Student stu4=new Student("小明4",85,61.5);
        Student stu5=new Student("小明5",84,61.5);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        Iterator<Student> iterator = list.iterator();
        double sum=0;
        double min=list.get(0).getGrade();
        double max=0;
        while (iterator.hasNext()){
            Student s=iterator.next();
            sum+=s.getGrade();
            if(s.getGrade()>max){
                max=s.getGrade();
            }
            if(min>s.getGrade()){
                min=s.getGrade();
            }
        }
        double avg=sum/list.size();
        System.out.println("平均分："+avg);
        System.out.println("总分:"+sum);
        System.out.println("最高分:"+max);
        System.out.println("最低分:"+min);
    }

}
