package operation.day10._02;

import java.util.ArrayList;

public class Course {
    String name="Java";
    String js=new Lecturer().getName();
    ArrayList<Student> list = new ArrayList<>();
    public Course(String name, String js, ArrayList<Student> list) {
        this.name = name;
        this.js = js;
        this.list = list;
    }

    public Course() {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getJs() {

        return js;
    }

    public void setJs(String js) {

        this.js = js;
    }
    public ArrayList<Student> getList() {
        return list;
    }
    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
    public void show() {
        System.out.println("课程信息：" + name+"\n授课老师:"+js);
        for (int i = 0; i < list.size(); i++) {
            Lecturer l=new Lecturer();
            System.out.println(l.call(list.get(i))+"："+list.get(i).getName());
        }
    }
}
