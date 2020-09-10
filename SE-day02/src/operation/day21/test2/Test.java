package operation.day21.test2;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test {
    @org.junit.Test
    public void test() throws Exception {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        Class<? extends ArrayList> c = list.getClass();
        Method add = c.getDeclaredMethod("add", Object.class);
        add.setAccessible(true);
        Object a = add.invoke(list, "abc");
        System.out.println(a);
        System.out.println(list);

    }

}
