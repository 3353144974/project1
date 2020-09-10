package operation.day21.test3;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Demo {
    @Test
    public void test()throws Exception{
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
    }
    @Test
    public void test2()throws Exception{
        Class<Student> studentClass = Student.class;
        Constructor<Student> declaredConstructor = studentClass.getConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Student student = declaredConstructor.newInstance("小明");

    }

}
