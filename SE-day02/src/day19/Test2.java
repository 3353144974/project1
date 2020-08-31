package day19;

import java.io.*;
import java.util.HashMap;

public class Test2 {
    public static void main(String[] args)throws Exception{
        HashMap<String, String> lineMap = new HashMap<>();
        // 创建流对象
         BufferedReader br = new BufferedReader(new FileReader("d:\\a\\1.txt"));
         BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\bbb\\1.txt"));
        // 读取数据
         String line = null;
         while ((line = br.readLine())!=null) {
        // 解析文本
         String[] split = line.split("\\.");
        // 保存到集合
         lineMap.put(split[0],split[1]);
         }
        // 释放资源
         br.close();
        // 遍历map集合
         for (int i = 1; i <= lineMap.size(); i++) {
         String key = String.valueOf(i);
        // 获取map中文本
         String value = lineMap.get(key);
        // 写出拼接文本
         bw.write(key+"."+value);
        // 写出换行
         bw.newLine();
         }
        // 释放资源
         bw.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\bbb\\1.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\bbb\\2.txt"));
        char[] cbuf = new char[1024];
        int len;
        while (true) {
            len = isr.read(cbuf);
            if(len==-1){
                break;
            }
            osw.write(cbuf, 0, len);
        }
        osw.flush();
        osw.close();
        isr.close();
    }


}
