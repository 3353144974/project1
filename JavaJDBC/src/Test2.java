
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //数据的增加 ；
        try {
            //加载驱动；
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&characterEncoding=utf8", "root", "root");


            Scanner sc = new Scanner(System.in);
            System.out.println("账号:");
            String stdname = sc.nextLine();
            System.out.println("密码:");
            int stdpass = sc.nextInt();

            //预处理SQL语句 ；
            String sql = "INSERT INTO student (name, age) VALUES (?, ?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            //给3个问号赋值 ；
            pre.setString(1, stdname);
            pre.setInt(2, stdpass);

            //执行修改的操作；
            pre.executeUpdate();
            System.out.println("数据插入成功");
            pre.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}



