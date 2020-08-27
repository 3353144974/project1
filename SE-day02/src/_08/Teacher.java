package _08;

public class Teacher extends Slapp{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void attend(){
       System.out.println("年龄"+age+"岁的"+name+"在上课");
   }
}
