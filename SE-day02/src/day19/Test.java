package day19;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        long start2 = System.currentTimeMillis();
        try {
            FileInputStream fis=new FileInputStream("d:\\a\\mysql-installer-community-5.7.13.0.msi");
            FileOutputStream fos=new FileOutputStream("d:\\bbb\\mysql-installer-community-5.7.13.0.msi");
            int len2;
            byte[] b=new byte[1024];
            while (true){
                len2=fis.read(b);
                if(len2==-1){
                    break;
                }
                fos.write(b,0,len2);
            }
            fos.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);
        long start = System.currentTimeMillis();
        try {
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\a\\mysql-installer-community-5.7.13.0.msi"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d:\\bbb\\mysql-installer-community-5.7.13.0.msi"));
            int len;
            byte[] n=new byte[1024];
            while (true){
                len=bis.read(n);
                if(len==-1){
                    break;
                }
                bos.write(n,0,len);
            }
            bos.close();
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
