package operation.day15.test6;

public class ChuangKou extends Thread{
    private Integer num=20;

    public ChuangKou(String name) {
        super(name);
    }
    private static Object obj=new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (num <= 0) {
                    System.out.println("卖完了");
                }
                System.out.println("当前窗口为：" + getName() + "卖了一张票，剩余票数为" + (num - 1));
                num--;
            }
        }
    }
}
