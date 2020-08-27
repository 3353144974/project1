package operation.day10._03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        for (int i = 1; i < 51; i++) {
            User u = new User();
            u.setId(i);
            list.add(u);
        }
        User u = new User();
        System.out.println("未分组:");
        System.out.print("[ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getId() + "-" + list.get(i).getYtpe() + " ");
        }
        System.out.print("]");
            Receptionist r1=new Receptionist();
            Receptionist r2=new Receptionist();
            Receptionist r3=new Receptionist();
            r1.setFilter(
                ( User user)->{
                    if (user.getId() >= 10 && user.getId() <= 19) {
                        user.setYtpe("v1");
                    }
            });
        r2.setFilter(
                ( User user)->{
                    if (user.getId() >= 20 && user.getId() <= 29) {
                        user.setYtpe("v2");
                    }
                });
        System.out.println("\n以分组：");
        int j=1;
        for (int i = 0; i < list.size(); i++) {
            User user=list.get(i);
            r1.install(user);
            r2.install(user);
            System.out.print(user.getId() + "-" + user.getYtpe() + " ");
            if (j % 9 == 0) {
                System.out.println();
            }
            j++;
        }
    }
}
