package operation.day17.gk2;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //1. 根据指定的文件夹路径创建文件对象
        // 2. 定义一个递归方法用来遍历文件夹的所有文件，方法参数：文件对象
        // 3. 在递归方法中获得文件夹的所有文件，得到一个文件数组
        // 4. 遍历文件数组，获得每一个文件对象，如果文件对象是文件则输出全路径，如果是文件夹则，则将该文件夹 对象作为参数递归调用当前方法。
        File f=new File("d:\\ccc");
        f(f);
    }
    public static void f(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                System.out.println(file1.getAbsolutePath());
            }else {
                f(file1);
            }
        }

    }

}
