package operation.As7._07;

public class Test {
    public static void main(String[] args) {
        GouWuChe gouWuChe=new GouWuChe();
        Laptop l=new Laptop();
        l.name="笔记本";
        l.id="g10000";
        l.price=10000;
        Phone p=new Phone();
        p.name="手机";
        p.id="g10001";
        p.price=5000;
        Fruit f=new Fruit();
        f.name="苹果";
        f.id="g20000";
        f.price=50;
        System.out.println("==========添加商品==========");
        gouWuChe.addGoods(l);
        gouWuChe.addGoods(p);
        gouWuChe.addGoods(f);
        gouWuChe.showGoods();
        gouWuChe.total();
    }
}
