package operation.day15.test5;

public class Cat implements Runnable{
private Integer num=80;
private Integer i=0;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if(num<=0){
                    System.out.println("没座位了");
                    System.exit(1);
                }
                i++;
                System.out.println(Thread.currentThread().getName() + "上车一人" + "还剩余" + (num-1) + "个座位，以坐" + i + "人");
                num--;
            }
        }
    }
}
