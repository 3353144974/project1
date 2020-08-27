package operation.day11.Test1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date now=new Date();
        DateFormat format=new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss");
        String str=format.format(now);
        System.out.println(str);
    }
}
