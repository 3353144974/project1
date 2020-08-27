package operation.As6._01;

public class Test01 {
    public static void main(String[] args) {
        Coder c=new Coder("马化腾",40);
        Teacher t=new Teacher("马云",35);
        c.eat();
        c.bed();
        c.coding();
        System.out.println("--------------");
        t.eat();
        t.bed();
        t.teach();
    }
}
