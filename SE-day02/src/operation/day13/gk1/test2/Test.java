package operation.day13.gk1.test2;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String>link=new LinkedList<>();
        link.add("2152");
        link.addFirst("123");
        link.addLast("456");
        System.out.println(link);
        link.getFirst();
        link.getLast();
        link.removeFirst();
        link.removeLast();
        System.out.println(link);
    }
}
