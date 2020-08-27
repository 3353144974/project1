package operation.day17.gk1;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        //1. 在c盘aaa文件夹中创建一个b.txt文件并输入数据
        // 2. 创建文件对象关联路径：c:/aaa/b.txt
        // 3. 调用文件对象的相关方法获得信息并输出。可以通过API帮助文档查询方法。
        File f=new File("d:\\aaa\\b.txt");
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");
        System.out.println("文件绝对路径:"+f.getAbsolutePath());
        System.out.println("文件构造路径:"+f.getParent());
    }

}
