import utils.DbUtil;

public class Test4 {
    public static void main(String[] args) {
        add(new User2(1001, "孙权", 50));
    }
    public static void add(User2 user2){
        String sql="update student set name=? where id=?";
        DbUtil.getupdate(sql,user2.getName(),user2.getId());
    }

}


