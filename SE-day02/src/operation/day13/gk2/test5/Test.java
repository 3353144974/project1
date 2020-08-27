package operation.day13.gk2.test5;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        String[] arr={"abc","bad","abc","aab","bad","cef","jhi"};
        HashSet<String> h=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        ArrayList<String> list=new ArrayList();
        list.addAll(h);
        for (String str:list){
            System.out.println(str);
        }
    }
}
