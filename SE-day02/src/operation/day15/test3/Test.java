package operation.day15.test3;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String[] str={"张1","张2","张3","张4","张5","张6","张7","张8","张9","张10"};
        Paer p=new Paer();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(p,str[i]);
            t.start();
        }


    }

}
