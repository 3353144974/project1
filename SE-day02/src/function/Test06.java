package function;

public class Test06 {
    public static void main(String[] args) {
        G001 g=new G001();
        g.name="狗子1号";
        g.age=1;
        g.color="红";
        G002 g1=new G002("狗子2号",2,"白");
        G003 g2=new G003("狗子3号",3,"黑");
        if(g.age>g1.age){
            if(g.age>g2.age){
                g.wagging();
            }else {
                g2.wagging();
            }
        }else if(g1.age>g2.age){
            g1.wagging();
        }else {
            g2.wagging();
        }
    }
}
