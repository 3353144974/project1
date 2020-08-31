package operation.day19;

import operation.day19.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test7 {
    public static void main(String[] args)throws Exception {
        Student stu=new Student();
        stu.setAge(20);
        stu.setName("张三");
        stu.setSex("男");
        FileOutputStream fos=new FileOutputStream("a.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(stu);
        oos.close();
        fos.flush();
        fos.close();
    }

}
