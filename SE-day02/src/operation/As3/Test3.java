package operation.As3;

public class Test3 {
    public static void main(String[] args) {
        Manager manager=new Manager("James",9527,15000,3000);
        Coder coder=new Coder("Kobe",0025,10000);
        manager.intor();
        manager.showSalary();
        manager.work();
        System.out.println("=================");
        coder.intor();
        coder.showSalary();
        coder.work();
    }
}
