package operation.As6._02;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color, double jg) {
        super(name, color, jg);
    }

    public void catchMouse(){
       System.out.println(name+"抓老鼠");
   }
}
