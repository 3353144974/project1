package operation.day11.test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String str="2000-05-17";
        Date date=df.parse(str);
        Date d=new Date();
        long chuSheng=date.getTime();
        long xianZai=d.getTime();
        long tian=xianZai-chuSheng;
        System.out.println(tian/1000/60/60/24);
    }
}
