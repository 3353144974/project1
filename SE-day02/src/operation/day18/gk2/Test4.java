package operation.day18.gk2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        // 加载文本中信息到属性集
        pro.load(new FileInputStream("D:\\project1\\SE-day02\\src\\score.txt"));
        FileOutputStream fos=new FileOutputStream("D:\\project1\\SE-day02\\src\\score.txt");
        // 遍历集合并打印
        Set<String> strings = pro.stringPropertyNames();
        System.out.println(pro);
        for (String key : strings) {
            if("lisi".equals(key)){
                pro.setProperty(key, "100");
            }
            String str=key+"="+pro.getProperty(key)+"\r\n";
            fos.write(str.getBytes());
            System.out.println(key + " ‐‐ " + pro.getProperty(key));
        }
    }

}
