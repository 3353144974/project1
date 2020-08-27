package operation.day15.test4;

public class Cup implements Runnable{
    private Integer num=100;
    @Override
    public void run() {
        int i=0;
        while (true){
            synchronized (this) {
            if(num<=0){
                System.out.println("卖完了");
                break;
            }
                i++;
                System.out.println(Thread.currentThread().getName() + "卖出第" + (101-num) + "个,总共剩余" + (--num) + "个");
            }
        }
        System.out.println(Thread.currentThread().getName() + "卖出"+i);
    }
}
