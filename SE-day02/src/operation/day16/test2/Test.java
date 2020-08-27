package operation.day16.test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
       Thread t= new Thread(new Runnable() {
            @Override
            public void run() {
                int avg=1;
                for (int i = 1; i <= 10; i++) {
                    avg*=i;
                }
                System.out.println("10的阶乘为:"+avg);
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                int avg=1;
                for (int i = 1; i <= 5; i++) {
                    avg*=i;
                }
                System.out.println("5的阶乘为:"+avg);
            }
        });
        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {
                int avg=1;
                for (int i = 1; i <= 8; i++) {
                    avg*=i;
                }
                System.out.println("8的阶乘为:"+avg);
            }
        });
        service.submit(t);
        service.submit(t2);
        service.submit(t3);
    }
}
