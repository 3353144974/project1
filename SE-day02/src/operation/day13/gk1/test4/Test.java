package operation.day13.gk1.test4;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Person>h=new HashSet<>();
        h.add(new Person("张三",20));
        h.add(new Person("张三1",30));
        h.add(new Person("张三2",40));
        h.add(new Person("张三",20));
        h.stream().forEach((n)->{
            System.out.println(n.getName()+" "+n.getAge());
        });
    }
}
