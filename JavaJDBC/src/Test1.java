import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test1 {
    public static void main(String[] args) {
        //        	System.out.println("数据连接成功");
        //数据的查询
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&characterEncoding=utf8", "root", "root");
            String sql = "select * from student";
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }
            System.out.println("以上是查询结果");
            rs.close();
            pre.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
