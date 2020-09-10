package day22;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        BufferedInputStream bis= null;
        BufferedOutputStream bos= null;
        try {
            bis = new BufferedInputStream(new FileInputStream("d:\\test\\a.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("d:\\test1\\"+System.currentTimeMillis()+"a.text"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] b=new byte[1024*8];
        int len;
        while (true){
            try {
                len=bis.read(b);
                if(len==-1){
                    break;
                }
                bos.write(b,0,len);
                bos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            if(bos!=null){
                bos.close();
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
