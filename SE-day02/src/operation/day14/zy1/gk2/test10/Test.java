package operation.day14.zy1.gk2.test10;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String[] str={"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] str2={"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String,String>h=new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            h.put(str[i],str2[i]);
        }
        System.out.println(h);
    }
}
