package operation.day21.test8;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class Demo {
    public static void main(String[] args) throws Exception{
        Properties pro = new Properties();
        pro.load(new FileInputStream("D:\\project1\\SE-day02\\src\\text.Properties"));
        Set<String> strings = pro.stringPropertyNames();
        for (String string : strings) {
            Class c=Class.forName(pro.getProperty(string));
            Object o = c.newInstance();
            Method showString = c.getMethod("run");
            showString.invoke(o);
        }
    }

}
