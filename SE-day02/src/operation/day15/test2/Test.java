package operation.day15.test2;

public class Test {
    public static void main(String[] args) {
       Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("播放背景音乐");
                }
            }
        });
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("显示画面");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
