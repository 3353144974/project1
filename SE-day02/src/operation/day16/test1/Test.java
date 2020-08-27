package operation.day16.test1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws Exception {
        Sum s=new Sum();
        Sum s2=new Sum();
        Sum s3=new Sum();
        FutureTask<Double> futureTask=new FutureTask<>(s);
        FutureTask<Double> futureTask2=new FutureTask<>(s2);
        FutureTask<Double> futureTask3=new FutureTask<>(s3);
        Thread t=new Thread(futureTask);
        Thread t2=new Thread(futureTask2);
        Thread t3=new Thread(futureTask3);
        t.start();
        t2.start();
        t3.start();
        System.out.println(futureTask.get());
        System.out.println(futureTask2.get());
        System.out.println(futureTask3.get());
    }
}
