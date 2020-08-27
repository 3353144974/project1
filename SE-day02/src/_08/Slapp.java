package _08;

public class Slapp {
    String name;
    int age;

    public Slapp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("年龄"+age+"岁的"+name+"在吃饭");
    }
    public void sleep(){
        System.out.println("年龄"+age+"岁的"+name+"在睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
