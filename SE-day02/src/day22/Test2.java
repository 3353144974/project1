package day22;

public class Test2 {
    static Integer sum = 100;
    public static void main(String[] args) {
        Object obj = new Object();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        if (sum == 0) {
                            break;
                        }
                        System.out.println("售出途径：" + Thread.currentThread().getName() + "，卖出第" + (101 - sum) + "个，剩余" + --sum + "个");
                    }
                }
            }
        };
        Thread thread=new Thread(runnable,"实体店");
        Thread thread2=new Thread(runnable,"官网");
        thread.start();
        thread2.start();
    }

}
