package operation.day21.test9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Test {

    public static void main(String[] args)throws Exception {
        String filePath = "D:\\project1\\SE-day02\\src\\test.Properties";
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        Properties pro = new Properties();
        pro.load(new FileInputStream(filePath));
        String count = pro.getProperty("count");
        if (null == count) {
            pro.setProperty("count", "0");
            pro.store(new FileOutputStream(filePath), "");
        } else {
            int num = Integer.parseInt(count);
            if (num < 3) {
                num++;
                pro.setProperty("count", num + "");
                pro.store(new FileOutputStream(filePath), "");
            } else {
                System.out.println("该程序使用次数已满，请续费");
            }
        }
    }
}
