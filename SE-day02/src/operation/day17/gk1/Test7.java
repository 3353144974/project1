package operation.day17.gk1;

import java.io.File;

public class Test7 {
    public static void main(String[] args)throws Exception {
        //1. 创建两个文件对象分别关联到不同的文件，比如：c:/a.txt，c:/aaa
        // 2. 调用文件对象的判断是否是文件或是否是文件夹的方法
        // 3. 获得文件名，根据判断结果输出信息。
        File f = new File("d:\\a.txt");
        File f2 = new File("d:\\aaa");
        // 判断是文件还是目录
        f.createNewFile();
        f2.mkdir();
         System.out.println("d:\\aaa 文件?:"+f.isFile());
         System.out.println("d:\\aaa 目录?:"+f2.isDirectory());
    }

}
