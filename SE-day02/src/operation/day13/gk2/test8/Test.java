package operation.day13.gk2.test8;

import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer>hs=new HashSet<>();
        while (true){
            int i=sc.nextInt();
            if(i==-1){
                break;
            }
            hs.add(i);
        }
        int sum=0;
        for (Integer i:hs){
            sum+=i;
        }
        System.out.println("总和是："+sum+"平均值是:"+(sum/hs.size()));
    }
}
