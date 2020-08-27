package operation.day13.gk2.test3;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String>link=new LinkedList<>();
        for (int i = 0; i < strs.length; i++) {
            if(link.indexOf(strs[i])==-1){
                link.add(strs[i]);
            }
        }
        for (String s:link){
            System.out.println(s);
        }
        Iterator<String> iterator = link.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
