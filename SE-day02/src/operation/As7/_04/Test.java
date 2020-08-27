package operation.As7._04;

public class Test {
    public static void main(String[] args) {
        Animal d=new Dog();
        Animal c=new Cat();
        d.name="狗";
        c.name="猫";
        d.eat();
        c.eat();
        if(d instanceof Dog){
            Dog b=(Dog) d;
            b.lookHome();
        }
        if(c instanceof Cat){
            Cat s=(Cat) c;
            s.catchMouse();
        }

    }
}
