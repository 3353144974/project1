package operation.day19;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test5 {
    public static void main(String[] args) throws Exception{
        String str="我爱java";
        FileOutputStream fos=new FileOutputStream("a.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
        osw.write(str);
        osw.close();
        fos.close();
    }

}
