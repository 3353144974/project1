package operation.day19;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test6 {
    public static void main(String[] args) throws Exception {
//        1. �����ֽ�����������ָ���ļ�·����
//        2. �����ֽ����������󴴽�ת������������ָ���ַ�������Ϊ��gbk
//        3. ����ת������������Ķ�ȡ������ȡ����
//        4. �ر����ͷ���Դ
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
