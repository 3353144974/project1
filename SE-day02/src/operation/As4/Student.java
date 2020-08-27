package operation.As4;

import java.util.*;

public class Student {
    private String id;
    private String name;
    private double height;
    public Student(){}
    public Student(String id,String name,double height){
        this.id=id;
        this.name=name;
        this.height=height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public static void main(String[] args) {
        Student s1=new Student("it001","黄渤",1.72);
        Student s2=new Student("it002","孙红雷",1.78);
        Student s3=new Student("it003","章子怡",1.64);
        Student s4=new Student("it004","杨颖",1.68);
        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("集合大小："+list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).id+","+list.get(i).name+","+list.get(i).height);
        }
        System.out.println("-------------------");
        System.out.println("身高1.70以上的学员：");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getHeight()>1.70){
                System.out.println(list.get(i).id+","+list.get(i).name+","+list.get(i).height);
            }
        }
    }
}
