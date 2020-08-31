package operation.day19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test8 {
    public static void main(String[] args)throws Exception {
        Student s=null;
        FileInputStream fis=new FileInputStream("a.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        s=(Student)ois.readObject();
        ois.close();
        fis.close();
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println(s.getSex());
    }

}
