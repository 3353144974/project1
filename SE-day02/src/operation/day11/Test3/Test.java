package operation.day11.Test3;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH,500);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int dayOfMonth=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");
    }
}
