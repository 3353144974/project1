package operation.As3;

public class Manager {
    private String name;
    private int gh;
    private int zx;
    private int jiangj;
    public Manager(){}
    public Manager(String name,int gh,int zx,int jiangj){
        this.name=name;
        this.gh=gh;
        this.zx=zx;
        this.jiangj=jiangj;
    }
    public int getJiangj() {
        return jiangj;
    }
    public void setJiangj(int jiangj) {
        this.jiangj = jiangj;
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
        System.out.println("基本工资为"+zx+",奖金"+jiangj);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
