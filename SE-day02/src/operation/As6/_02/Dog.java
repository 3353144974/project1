package operation.As6._02;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String color, double jg) {
        super(name, color, jg);
    }

    public void lookHome(){
        System.out.println(name+"看家");
    }
}
