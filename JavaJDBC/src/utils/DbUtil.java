package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Set;

/**
 * @auth admin
 * @date 2020/9/8
 * @Description
 */
public class DbUtil {

    private static String DRIVER = null;
    private static String URL = null;
    private static String USERNAME = null;
    private static String PASSWORD = null;

    static {
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream("JavaJDBC/src/db.properties"));
            DRIVER = pro.getProperty("driver");
            URL = pro.getProperty("url");
            USERNAME = pro.getProperty("username");
            PASSWORD = pro.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pro.clear();
        }
    }

    public static void getupdate(String sql, Object... obj) {
        if (sql == null || sql == "" || obj == null || obj.length <= 0) {
            return;
        }
        Connection conn = null;
        PreparedStatement pre =null;
        try {
            conn = getConn();
            pre = conn.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                pre.setObject(i+1,obj[i]);
            }
            //执行修改的操作；
            pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close(conn,pre);
        }
    }

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
