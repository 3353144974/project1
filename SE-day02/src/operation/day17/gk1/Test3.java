package operation.day17.gk1;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //1. 创建文件对象指定路径为c:/bbb
        // 2. 调用文件对象创建文件夹的方法
        File f=new File("d:\\bbb");
        f.mkdir();
    }
}
