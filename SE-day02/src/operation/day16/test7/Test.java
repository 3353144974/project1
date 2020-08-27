package operation.day16.test7;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        new Thread(()->{
            while (true){
                synchronized (p) {
                    Random r=new Random();
                   if((r.nextInt(2)+1)==1){
                       p.setName("小明");
                       p.setSex("男");
                   }else {
                       p.setName("小红");
                       p.setSex("女");
                   }
                    try {
                        p.notifyAll();
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                synchronized (p) {
                    System.out.println(p.getName()+"  "+p.getSex());
                    try {
                        p.notifyAll();
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
