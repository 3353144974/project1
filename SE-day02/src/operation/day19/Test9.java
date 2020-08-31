package operation.day19;

import java.io.PrintStream;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) throws Exception{
        //1. 创建字节打印流对象并关联文件路径
        //2. 调用字节打印流对象的打印方法将内容输入到目标文件中
        //3. 关闭流释放资源
        Scanner sc=new Scanner(System.in);
        PrintStream ps = new PrintStream("b.txt");
        System.setOut(ps);
        System.out.println(sc.next());
        ps.close();
    }

}
