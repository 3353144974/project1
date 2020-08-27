package operation.day14.zy1.gk3.test2;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String,String>h=new HashMap<>();
        h.put("及时雨","宋江");
        h.put("玉麒麟","卢俊义");
        h.put("智多星","吴用");
        System.out.println(h);
        h.put("入云龙","公孙胜");
        h.put("豹子头","林冲");
        System.out.println(h);
        h.remove("玉麒麟");
        System.out.println(h);
        h.put("智多星","null");
        System.out.println(h);
        String s = h.get("及时雨");
        h.remove("及时雨");
        h.put("呼保义",s);
        System.out.println(h);
    }
}
