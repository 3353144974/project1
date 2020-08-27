package operation.day17.gk1;

import java.io.File;

public class Test8 {
    public static void main(String[] args) {
        //1. 创建文件对象关联到指定文件夹，比如：c:/aaa
        // 2. 调用文件对象的listFiles方法获得文件数组
        // 3. 遍历文件数组将每一个文件的名字输出到控制台
        File f = new File("d:\\ccc");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }

}
