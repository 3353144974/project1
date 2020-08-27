package operation.day12.test9;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("a");
        System.out.println(frequency(list, "a"));
    }

    public static int frequency(ArrayList<String> arr, String key) {
        int conut = 0;
        for (String a:arr){
            if(a.equals(key)){
                conut++;
            }
        }
        return conut;
    }
}
