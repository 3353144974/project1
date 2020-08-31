package operation.day19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws Exception{
        //分析以下需求，并用代码实现 实现一个验证码小程序，要求如下：
        // 1. 在项目根目录下新建一个文件：data.txt.txt，键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占 一行；
        // 2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存 在控制台提示验证失败
        BufferedWriter bos=new BufferedWriter(new FileWriter("data.txt"));
        HashSet<String> map=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        while (map.size()<3){
            String next = sc.next();
            bos.write(next);
            bos.newLine();
            map.add(next);
            bos.flush();
        }
        bos.close();
        System.out.println("请输入验证码：");
        String s = sc.next();
        if(map.contains(s)){
            System.out.println("验证成功");
        }else {
            System.out.println("验证失败");
        }
    }

}
