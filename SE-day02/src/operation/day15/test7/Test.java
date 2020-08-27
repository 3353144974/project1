package operation.day15.test7;

public class Test {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            int sum=1;
            for (int i = 1; i <= 10; i++) {
                sum*=i;
            }
            System.out.println(sum);
        });
        Thread t2=new Thread(()->{
            int sum=1;
            for (int i = 1; i <= 5; i++) {
                sum*=i;
            }
            System.out.println(sum);
        });
        Thread t3=new Thread(()->{
            int sum=1;
            for (int i = 1; i <= 8; i++) {
                sum*=i;
            }
            System.out.println(sum);
        });
        t.start();
        t2.start();
        t3.start();
    }

}
