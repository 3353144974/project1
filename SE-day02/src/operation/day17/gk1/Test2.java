package operation.day17.gk1;

import java.io.File;

public class Test2 {
    public static void main(String[] args) throws Exception{
//        1. 使用绝对路径创建对象关联到c盘的a.txt。
//        2. 通过文件对象方法判断文件是否存在。
//        3. 不存在则调用创建文件的方法创建文件。
        File f=new File("d:\\a.txt");
        if(!f.exists()){
            f.createNewFile();
        }
    }

}
