package operation.day17.gk1;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        //1. 创建文件对象关联路径：c:/a.txt
        // 2. 调用文件对象删除文件的方法
        // 3. 创建文件对象关联路径：c:/aaa
        // 4. 调用文件对象删除文件的方法
        File f=new File("d:\\a.txt");
        System.out.println(f.delete());
        File f2=new File("d:\\aaa");
        System.out.println(f2.delete());
    }
}
