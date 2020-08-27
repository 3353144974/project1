package function;

public class Ming {
    String name;
    char gender;
    String zuop;

    public Ming() {
    }

    public Ming(String name, char gender, String zuop) {
        this.name = name;
        this.gender = gender;
        this.zuop = zuop;
    }

    public void sing(){
        System.out.println(name+"明星唱歌需要100元");
    }
    public void acting(){
        System.out.println(name+"明星演戏需要200元");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getZuop() {
        return zuop;
    }

    public void setZuop(String zuop) {
        this.zuop = zuop;
    }
}
