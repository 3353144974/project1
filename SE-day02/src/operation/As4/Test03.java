package operation.As4;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String s1="孙悟空";
        String s2="猪八戒";
        String s3="沙和尚";
        String s4="铁扇公主";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("获取索引为3的元素："+list.get(3));
        list.set(3,"唐僧");
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
