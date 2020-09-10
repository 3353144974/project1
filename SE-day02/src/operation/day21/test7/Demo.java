package operation.day21.test7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {
        Person p=new Person();
        Class<? extends Person> aClass = p.getClass();
        Person person = aClass.newInstance();
        Method setName = aClass.getMethod("setName",String.class);
        setName.setAccessible(true);
        Object o = setName.invoke(person, "小明");
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(person,20);


    }

}
