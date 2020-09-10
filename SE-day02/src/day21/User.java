package day21;

public class User {
    private String name;
    private Integer age;
    private String sex;

    public User() {
        System.out.println("无参构造");
    }

    public User(String name) {
        System.out.println("有参构造1");
        this.name = name;
    }
    User(Integer age) {
        System.out.println("默认构造");
        this.age = age;
    }

    public User(String name, Integer age) {
        System.out.println("有参构造2");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private User(String name, String sex) {
        System.out.println("private有参构造1");
        this.name = name;
        this.sex = sex;
    }

    private User(Integer age, String sex) {
        System.out.println("private有参构造2");
        this.age = age;
        this.sex = sex;
    }

    public User(String name, Integer age, String sex) {
        System.out.println("有参构造3");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void eat(){
        System.out.println("公有");
    }
    private void aat(){
        System.out.println("私有");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
