package operation.day15.test1;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Zi2 z=new Zi2();
        Thread t = new Thread(z, "小强");
        t.start();
    }

}
