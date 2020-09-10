import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 数据删除
        try {
            //加载驱动；
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&characterEncoding=utf8", "root", "root");
            Scanner sc = new Scanner(System.in);
            System.out.println("密码:");
            int stdpass = sc.nextInt();
            String sql = "DELETE FROM student WHERE age=?";
            PreparedStatement pre = conn.prepareStatement(sql);
            //给3个问号赋值 ；
            pre.setInt(1, stdpass);
            //	pre.setString(3, "123456");

            //执行修改的操作；
            pre.executeUpdate();
            System.out.println("数据删成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


