package operation.day17.gk1;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //在C盘下创建一个名为ccc的文件夹，要求如下：
        // 1.ccc文件夹中要求包含bbb子文件夹
        // 2.bbb子文件夹要求包含aaa文件夹
        File f=new File("d:\\ccc\\bbb\\aaa");
        System.out.println(f.mkdirs());
    }

}
