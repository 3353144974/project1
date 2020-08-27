package operation.day14.zy1.gk2.test8;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        HashMap<String, Integer> h = new HashMap<>();
        while (h.size() < 5) {
            String s = sc.nextLine();
            h.put(s, r.nextInt(101));
        }
        Integer sum = 0;
        Integer max = 0;
        Integer min = 100;
        Set<String> strings = h.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            sum += h.get(next);
            if (max < h.get(next)) {
                max = h.get(next);
            }
            if (min > h.get(next)) {
                min = h.get(next);
            }
        }
        System.out.println("总分=" + sum + ",最高分=" + max + ",最低分=" + min + "平均分=" + (double) (sum / h.size()));
    }
}
