package operation.day16.test8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class HuiChang implements Runnable {
    int i = 0;
    DoubleColorBallUtil doubleColorBallUtil = new DoubleColorBallUtil();

    @Override
    public void run() {
        int a = 0;
        Random r = new Random();
        HashSet<Integer> h = new HashSet<>();
        while (h.size() < 100) {
            h.add(r.nextInt(100) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(h);
        Collections.shuffle(list);
        while (true) {
            synchronized (doubleColorBallUtil) {
                if (i > 99) {
                    break;
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("编号为:" + list.get(i) + "的员工从" + Thread.currentThread().getName() + "入场!拿到的双色球号码是：" + doubleColorBallUtil.create());

            }
            i++;
            ++a;
        }
        System.out.println("从" + Thread.currentThread().getName() + "入场的员工总共:" + a + "位员工");

    }
}
