package operation.day17.gk3;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        //使用文件过滤器筛选将指定文件夹下的小于200K的小文件获取并打印(包括所有子文件夹的文件)。
        File f=new File("d:\\ccc");
        sc(f);
    }
    public static void sc(File file){
        File[] files = file.listFiles(f2-> file.length() < 200);
        for (File file1 : files) {
            if(file1.isFile()){
                System.out.println(file1);
            }else {
                sc(file1);
            }
        }
    }


}
