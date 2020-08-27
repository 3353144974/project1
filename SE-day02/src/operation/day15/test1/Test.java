package operation.day15.test1;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Zi zi=new Zi();
        zi.start();

    }
}
