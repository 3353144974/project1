package operation.As6._06;

public class Chef extends Worker{
    public Chef(String gh, String name, double gz) {
        super(gh, name, gz);
    }

    public void gongZ(){
        System.out.println("工号为:"+gh+"姓名为"+name+"工资为:"+gz+"的厨师在吃肉");
    }
    public void eat(){
        System.out.println("工号为:"+gh+"姓名为"+name+"工资为:"+gz+"的经理在工作，炒菜");
    }

}
