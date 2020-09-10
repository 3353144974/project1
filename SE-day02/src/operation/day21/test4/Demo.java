package operation.day21.test4;

import org.junit.Test;

import java.lang.reflect.Method;

public class Demo {
    @Test
    public void test()throws Exception{
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
        Method eat = studentClass.getMethod("show");
        Object invoke = eat.invoke(student);
        System.out.println(invoke);
    }

}
