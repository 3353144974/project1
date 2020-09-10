/**
 * @auth admin
 * @date 2020/9/8
 * @Description
 */
public class User2 {

    private Integer id;
    private String name;
    private Integer age;

    public User2() {
    }

    public User2(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
