package operation.day21.test6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception{
        Student stu = new Student();
        setProperty(stu, "name", "张三");
        setProperty(stu, "age", 18);

        Object value1 = getProperty(stu, "name");
        System.out.println(value1);

        Object value2 = getProperty(stu, "age");
        System.out.println(value2);
    }

    /**
     * 根据对象获取属性的值
     *
     * @param obj 对象
     * @param name 属性
     * @return 属性的值
     */
    private static Object getProperty(Object obj, String name) throws Exception{
        Class<?> aClass = obj.getClass();
        String methodName = "get" + name.substring(0,1).toUpperCase() + name.substring(1);
        Method method = aClass.getMethod(methodName);
        return method.invoke(obj);
    }

    /**
     * 给对象设属性值
     *
     * @param obj   对象
     * @param name  属性名
     * @param value 值
     */
    private static void setProperty(Object obj, String name, Object value) throws Exception{
        Class<?> aClass = obj.getClass();
        String methodName = "set" + name.substring(0,1).toUpperCase() + name.substring(1);
        Method method = aClass.getMethod(methodName, value.getClass());
        method.invoke(obj,value);
    }
}
