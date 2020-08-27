package _07;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=sc.next();
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for (int i = 0; i < str.length(); i++) {
            char ss=str.charAt(i);
            if(ss>='a'&&ss<='z'){
                a++;
            }else if(ss>='A'&&ss<='Z'){
                b++;
            }else if(ss>='0'&&ss<='9'){
                c++;
            }else {
                d++;
            }
        }
    }
}
