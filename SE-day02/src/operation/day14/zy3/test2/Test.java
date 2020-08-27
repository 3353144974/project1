package operation.day14.zy3.test2;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        CjThread c=new CjThread();
//        c.run();
        new Thread(){
            @Override
            public void run() {
                Random r=new Random();
                Integer sum = 0;
                for (int i = 0; i < 10; i++) {
                    int j = r.nextInt(901) + 100;
                    sum+=j;
                    System.out.println(getName() + "：正在执行！" + i);
                }
                System.out.println(sum);
            }
        }.run();

        Runnable r=new Runnable(){
            @Override
            public void run() {
                Random r=new Random();
                Integer sum = 0;
                for (int i = 0; i < 10; i++) {
                    int j = r.nextInt(901) + 100;
                    sum+=j;
                }
                System.out.println(sum);
            }
        };
        for (int i = 0; i < 10; i++) {
            Integer sum = 0;
        }
        new Thread(r).start();
    }
}
