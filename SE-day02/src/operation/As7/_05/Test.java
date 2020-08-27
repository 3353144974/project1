package operation.As7._05;

public class Test {
    public static void goToSport(Sport sport){
        sport.playBasketball();
    }
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="马云";
        t1.age=45;
        SportTeacher t2=new SportTeacher();
        t2.name="大姚";
        t2.age=35;
        Student s1=new Student();
        s1.name="小王";
        s1.age=20;
        SportStudent s2=new SportStudent();
        s2.name="王中王";
        s2.age=21;
        goToSport(t2);
        goToSport(s2);
    }
}
