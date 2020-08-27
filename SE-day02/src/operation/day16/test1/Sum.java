package operation.day16.test1;

import java.util.Random;
import java.util.concurrent.Callable;

public class Sum implements Callable {

    @Override
    public Object call() throws Exception {
        Random r=new Random();
        Double avg;
        int sum=0;
        for (int i = 0; i < 10; i++) {
            sum+=r.nextInt(100)+1;
        }
        avg=(double)sum/10;
        return avg;
    }
}
