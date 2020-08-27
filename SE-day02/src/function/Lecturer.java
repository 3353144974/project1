package function;

public class Lecturer {
    String name;
    int age;
    String subject;
    public void lecture(){
        System.out.println(name+"老师正在讲课，讲的是"+subject);
    }
    public void homework(){
        String clss="java";
        System.out.println(clss+"班级加作业");
    }
}
