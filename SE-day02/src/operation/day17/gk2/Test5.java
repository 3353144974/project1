package operation.day17.gk2;

import java.io.File;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //1. 创建键盘录入对象Scanner
        // 2. 定义字符串接收用户输入的文件夹路径
        // 3. 根据文件夹路径创建文件对象
        // 4. 调用文件对象的listFiles方法获得文件数组
        // 5. 遍历文件数组，删除每一个文件
        // 6. 最后调用删除方法删除文件夹。
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        File f=new File(s);
        File[] files = f.listFiles();
        for (File file : files) {
            file.delete();
        }
        f.delete();
    }

}
