package operation.day17.gk2.test4;

import operation.day17.gk2.test4.Sar;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //1. 创建一个类实现文件过滤器FileFilter接口并重新accept方法，在该方法根据传入的文件判断是否文件Java文 件，如果是则返回true，否则返回false。
        // 2. 根据文件夹路径字符串创建文件对象和创建文件过滤器接口实现类对象
        // 3. 调用文件对象的listFiles(FileFilterf) 方法，传递文件过滤器实现类对象。
        // 4. 遍历文件数组，输入每一个文件对象
        File f=new File("d:\\ccc");
        File[] files = f.listFiles(new Sar());
        for (File file : files) {
            System.out.println(file);
        }
    }

}
