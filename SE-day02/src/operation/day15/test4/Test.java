package operation.day15.test4;

public class Test {
    public static void main(String[] args) {
        Cup c=new Cup();
        Thread t=new Thread(c,"实体店");
        Thread t2=new Thread(c,"官网");
        t.start();
        t2.start();
    }

}
