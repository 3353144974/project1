package operation.day10._02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Course k=new Course();
        for (int i = 0; i < 3; i++) {
            Student s=new Student();
            System.out.println("请输入名字：");
            s.setName(sc.next());
            System.out.println("有没有旷课，有则请输入true否则输入false");
            s.setAttendance(sc.nextBoolean());
            k.list.add(s);
            if(i==2) {
                k.show();
            }
        }

    }
}
