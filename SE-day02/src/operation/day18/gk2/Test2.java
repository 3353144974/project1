package operation.day18.gk2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) {
        File f=new File("d:\\ccc");
        sc(f);
    }
    public static void cc(File file)throws Exception{
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream("d:\\bbb\\ccc\\"+file.getName());
        int len;
        byte[] b=new byte[2];
        while (true){
            len=fis.read(b);
            if(len==-1){
                break;
            }
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
    public static void sc(File file){
        File[] files = file.listFiles();
        for (File ff : files) {
            if(ff.isFile()){
                try {
                    cc(ff);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else {
                sc(ff);
            }
        }
    }
}
