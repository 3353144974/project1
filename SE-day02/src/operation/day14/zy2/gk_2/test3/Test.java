package operation.day14.zy2.gk_2.test3;

public class Test {
    public static void main(String[] args){
        try {
            login("admin","admin");
        } catch (Exception ignored) {
            ignored.printStackTrace();
        }
    }

    public static void login(String name, String pwd) throws LoginException {
        if (!"admin".equals(name)) {
            throw new LoginException("用户名不存在");
        } else if (!"admin".equals(pwd)) {
            throw new LoginException("密码错误");
        } else {
            System.out.println("欢迎登录");
        }
    }

}
