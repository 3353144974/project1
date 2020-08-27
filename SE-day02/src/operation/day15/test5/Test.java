package operation.day15.test5;

public class Test {
    public static void main(String[] args) {
        Cat c=new Cat();
        Thread t=new Thread(c,"前门");
        Thread t2=new Thread(c,"中门");
        Thread t3=new Thread(c,"后门");
        t.start();
        t2.start();
        t3.start();
    }

}
