import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class day11 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        List<String> stream=list.stream().filter((n)->{return n.startsWith("张")&&n.length()==3;}).skip(1).limit(1).collect(Collectors.toList());
        stream.stream().forEach(System.out::println);
        int  number  = Integer.valueOf("123456");
        System.out.println(number);

    }
}
