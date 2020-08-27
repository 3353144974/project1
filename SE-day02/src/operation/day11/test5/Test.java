package operation.day11.test5;

public class Test {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        String str="0";

        for (int i = 1; i <= 10000; i++) {
            str+=i;
        }
        long end=System.currentTimeMillis();
        System.out.println("共耗时毫秒:"+(end-start));
        long start1=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            sb.append(i);
        }
        long end1=System.currentTimeMillis();
        System.out.println("共耗时毫秒:"+(end1-start1));
    }
}
