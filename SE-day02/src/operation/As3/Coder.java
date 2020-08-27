package operation.As3;

public class Coder {
    private String name;
    private int gh;
    private int zx;
    public Coder(){}
    public Coder(String name,int gh,int zx){
        this.name=name;
        this.gh=gh;
        this.zx=zx;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGh() {
        return gh;
    }

    public void setGh(int gh) {
        this.gh = gh;
    }

    public int getZx() {
        return zx;
    }

    public void setZx(int zx) {
        this.zx = zx;
    }
    public void intor(){
        System.out.println("程序员姓名:"+name);
        System.out.println("工号:"+gh);
    }
    public void showSalary(){
        System.out.println("基本工资为"+zx+",奖金无");
    }
    public void work(){
        System.out.println("正在努力写代码....");
    }
}
