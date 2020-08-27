package function;

public class G001 {
   String name;
   int age;
   String color;
    public G001() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void wagging(){
        System.out.println(name+"狗,今年"+age+"岁了，是"+color+"色，正在向某某人摇尾巴");
    }
}

