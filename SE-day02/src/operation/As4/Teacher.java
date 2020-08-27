package operation.As4;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private int age;
    private String like;
    public Teacher() {
    }
    public Teacher(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
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

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
    public void show(){
        System.out.println(name+","+age+","+like);
    }
    public static void main(String[] args) {
        ArrayList<Teacher> list=new ArrayList<>();
        Teacher t1=new Teacher("姚小明",23,"打篮球");
        Teacher t2=new Teacher("景甜",20,"打羽毛球");
        Teacher t3=new Teacher("薛之谦",45,"踢足球");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name+","+list.get(i).age+","+list.get(i).like);
        }
        System.out.println("---------------");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).age>40){
                Teacher t=list.get(i);
                t.setLike("打高尔夫");
                t.show();
            }
        }
    }
}
