package operation.day15.test1;

public class Zi extends Thread{
    public Zi() {
    }

    public Zi(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
    }
}
