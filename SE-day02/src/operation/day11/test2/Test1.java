package operation.day11.test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String str="2000-01-01";
        Date date=df.parse(str);
        System.out.println(date);
    }
}
