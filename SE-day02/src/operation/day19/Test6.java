package operation.day19;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test6 {
    public static void main(String[] args) throws Exception {
//        1. 创建字节输入流对象指定文件路径。
//        2. 根据字节输入流对象创建转换输入流对象并指定字符集编码为：gbk
//        3. 调用转换输入流对象的读取方法读取内容
//        4. 关闭流释放资源
        FileInputStream fis=new FileInputStream("a.txt");
        InputStreamReader isr=new InputStreamReader(fis,"GBK");
        int len;
        while (true){
            len=isr.read();
            if(len==-1){
                break;
            }
            System.out.println((char) len);
        }
        isr.close();
        fis.close();
    }

}
