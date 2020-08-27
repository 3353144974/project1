package operation.day13.gk1.test7;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String[] str={"x","dfdz","rtgbhtf","lxvg"};
        ArrayList<String> add = add(str);
        for (String s:add){
            System.out.println(s+" ");
        }
    }
    public static ArrayList<String> add(String... str){
        ArrayList<String>array=new ArrayList<>();
        for (String a:str){
            array.add(a);
        }
        return array;
    }

}
