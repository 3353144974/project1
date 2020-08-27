package operation.As5;

import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        String str=new String("bca");
        String str1=new String("dadfa");
        String str2=new String("dddaaa");
        String str3=new String("你好啊");
        String str4=new String("我来啦你干嘛呢");
        String str5=new String("别跑啊");
        arr.add(str);
        arr.add(str1);
        arr.add(str2);
        arr.add(str3);
        arr.add(str4);
        arr.add(str5);
        System.out.println("源ArrayList："+arr);
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).length()>4){
                arr.remove(i);
            }
        }
        System.out.println("删除后ArryList："+arr);
    }
}
