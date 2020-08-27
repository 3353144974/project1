package operation.day10._02;

public class Lecturer {
    String name="张老师";

    public Lecturer(String name) {
        this.name = name;
    }

    public Lecturer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String call(Student stu) {
        if(stu.getAttendance()){
            return "旷课";
        }else {
            return "上课";
        }
    }
}
