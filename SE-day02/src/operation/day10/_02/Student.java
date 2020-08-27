package operation.day10._02;

public class Student {
  String name;
  boolean attendance;

    public Student() {
    }

    public Student(String name, boolean attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getAttendance() {
        return attendance;
    }
    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }
}
