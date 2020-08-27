package day9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
// 创建日期对象，把当前的时间         
        System.out.println(new Date().getTime());// Tue Jan 16 14:37:35 CST 2018         
//  创建日期对象，把当前的毫秒值转成日期对象         
        System.out.println(new Date(0L));// Thu Jan 01 08:00:00 CST 1970
//        Date date = new Date();
        // 创建日期格式化对象,在获取格式化对象时可以指定风格        
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
//        String str = df.format(date);
        String str="2018年12月11日";
       Date date=df.parse(str);
        System.out.println(date);
        System.out.println(str);// 2008年1月23日

// 创建Calendar对象         
 Calendar cal=Calendar.getInstance();
//  设置年          
 int  year=cal.get(Calendar.YEAR);
//  设置月         
        cal.add(Calendar.YEAR,-3);
//        cal.set(Calendar.YEAR,2018);
 int month=cal.get(Calendar.MONTH)+1;

        cal.add(Calendar.DAY_OF_MONTH,2);
//  设置日         
 int dayOfMonth=cal.get(Calendar.DAY_OF_MONTH);
 System.out.println(year+"年"+month+"月"+dayOfMonth+"日");
//        Calendar cal= Calendar.getInstance();

        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");

        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");
    }
}
