package operation.day17.gk2;

import java.io.File;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //4. 定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，返回long类型数值表示文件夹的大小。
        // 5. 调用calculate方法传入文件夹对象，在该方法内部获得文件夹中所有文件，得到一个文件数组，定义一个变量size累加每一个文件的大小，
        // 遍历文件数组，判断是否是文件，如果是文件则获得文件大小并累加到变量 size中，如果是文件夹，继续递归调用当前方法。
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        File f=new File(s);
        System.out.println(calculate(f));
    }
    public static long calculate(File file){
        File[] files = file.listFiles();
        long size=0;
        for (File file1 : files) {
            if(file1.isFile()){
                size+=file1.length();
            }else {
                calculate(file1);
            }
        }
        return size;
    }
}
