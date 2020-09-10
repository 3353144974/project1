package day22;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String str="abcdesldfsldflsadlsf";
        char[] chars = str.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        map.forEach((key,value)->{
            System.out.println("字符："+key+",数量："+map.get(key));
        });
    }
    public static int age(int i){
        if(i==1){
            return 1;
        }else {
            return i*age(--i);
        }
    }

}
