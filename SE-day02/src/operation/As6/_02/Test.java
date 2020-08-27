package operation.As6._02;

public class Test {
    public static void main(String[] args) {
        Dog d=new Dog("旺财","花色",30);
        Cat c=new Cat("波斯猫","花色",80);
        d.est();
        d.lookHome();
        System.out.println("----------");
        c.est();
        c.catchMouse();
    }
}
