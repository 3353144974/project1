package operation.As7._01;

public interface A {
    public abstract void showA();
    public default void showB(){
        System.out.println("BBBB");
    }
}
