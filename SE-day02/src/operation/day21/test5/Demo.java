package operation.day21.test5;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        Class c=Class.forName(s);
        Object o = c.newInstance();
        Method showString = c.getMethod("showString");
        showString.invoke(o);
    }



}
