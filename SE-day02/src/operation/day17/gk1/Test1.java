package operation.day17.gk1;

import java.io.File;

public class Test1 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:\\as.txt");
        File f2=new File("a","A.txt");
        System.out.println("是否创建？"+f.createNewFile());
        System.out.println("是否创建？"+f2.createNewFile());

    }
}
