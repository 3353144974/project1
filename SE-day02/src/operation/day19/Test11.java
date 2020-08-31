package operation.day19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test11 {
    public static void main(String[] args) throws Exception{
        //1. 创建集合对象用来存放学生
        // 2. 创建多个学生对象添加到集合中
        // 3. 创建对象输出流关联目标文件
        // 4. 调用对象输出流的方法将集合对象保存到文件中
        // 5. 关闭流并释放资源
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student("张三",20,"女"));
        list.add(new Student("张三1",20,"女"));
        list.add(new Student("张三2",20,"女"));
        list.add(new Student("张三3",20,"女"));
        list.add(new Student("张三4",20,"女"));
        list.add(new Student("张三5",20,"女"));
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stus.txt"));
        for (Student student : list) {
            oos.writeObject(student);
        }
        oos.flush();
        oos.close();
    }

}
