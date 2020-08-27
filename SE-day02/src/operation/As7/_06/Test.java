package operation.As7._06;

public class Test {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.name="张小强";
        m.xz=9000.0;
        Coder c=new Coder();
        c.name="李小亮";
        c.xz=5000.0;
        Company c1=new Company();
        c1.paySalary(m);
        c1.paySalary(c);
    }
}
