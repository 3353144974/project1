package operation.day12.test11;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student stu1=new Student("小明1",88,1.60);
        Student stu2=new Student("小明2",87,1.65);
        Student stu3=new Student("小明3",86,1.70);
        Student stu4=new Student("小明4",85,1.75);
        Student stu5=new Student("小明5",84,1.77);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student it = iterator.next();
            it.setAge(it.getAge()+2);
        }
        for (Student stu:list){
            System.out.println("年龄"+stu.getAge()+"岁的"+stu.getName()+"身高："+stu.getHeight());
        }
    }
}
