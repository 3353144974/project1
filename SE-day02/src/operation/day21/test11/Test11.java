package operation.day21.test11;

import java.lang.reflect.Method;

public class Test11 {

    @MyTest
    public void method1(){
        System.out.println("方法1");
    }


    public void method2(){
        System.out.println("方法2");
    }

    @MyTest
    public void method3(){
        System.out.println("方法3");
    }


    public static void main(String[] args) throws Exception{
        Class<Test11> aClass = Test11.class;
        Test11 obj = aClass.newInstance();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)){
                method.invoke(obj);
            }
        }
    }
}
