package operation.As6._04;

public class Student extends Person{
    private int  fraction;
    public Student(){}
    public Student(int fraction) {
        this.fraction = fraction;
    }

    public Student(String name, int age, int fraction) {
        super(name, age);
        this.fraction = fraction;
    }

    public double getFraction() {
        return fraction;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }
    public void examination(){
        System.out.println(getName()+"tongxue，考试得了："+fraction);
    }
}
