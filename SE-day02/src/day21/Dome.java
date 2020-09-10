package day21;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Dome {

    @Test
    public void mas()throws Exception{
//        User u=new User();
        //Junit
        Class class1=User.class;
        //获取所有的public修饰的
        //Constructor
        Constructor[] constructors = class1.getConstructors();
        for (Constructor c:constructors){
            System.out.println(c);
        }
        //获取所有的构造器
        Constructor[] declaredConstructors = class1.getDeclaredConstructors();
        for (Constructor c:declaredConstructors){
            System.out.println(c);
        }
        Constructor constructor = class1.getConstructor(String.class);
        System.out.println(constructor);

        Constructor declaredConstructor = class1.getDeclaredConstructor(String.class,Integer.class);
        System.out.println(declaredConstructor);
        Constructor constructor1 = class1.getConstructor(String.class);

        Object instance = constructor1.newInstance("马赛克");
        Constructor declaredConstructor1 = class1.getDeclaredConstructor(String.class, String.class);
        System.out.println(instance);
        //暴力反射
        declaredConstructor1.setAccessible(true);
        Object o = declaredConstructor1.newInstance("马冬梅", "男");
        System.out.println(o);
        //Method
        Object o1 = class1.newInstance();
        Method method = class1.getMethod("eat");
        Object invoke = method.invoke(o1);
        Method[] methods = class1.getMethods();
        for (Method method1 : methods) {
            System.out.println(method1);
        }
        Method aat = class1.getDeclaredMethod("aat");
        aat.setAccessible(true);
        Object o2 = class1.newInstance();
        Object invoke1 = aat.invoke(o2);
        Method[] declaredMethods = class1.getDeclaredMethods();
        for (Constructor declaredConstructor2 : declaredConstructors) {
            System.out.println(declaredConstructor2);
        }
        //
        Field sex = class1.getDeclaredField("sex");
        sex.setAccessible(true);
        Object o3 = class1.newInstance();
        sex.set(o3,"男");
        System.out.println(o3);


    }

}
