package operation.day11.test6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df=new SimpleDateFormat();
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,2016);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DAY_OF_MONTH,18);
        df.applyPattern("yyyy年MM月dd日");
        String str=df.format(c.getTime());
        System.out.println(str);
//        DateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
//        String str="2016-12-18";
//        Date d=df1.parse(str);
//        long l=d.getTime();
//        Date d2=new Date(l);
//        String str2=df.format(d2);
//        System.out.println(str2);
    }
}
