package operation.As7._03;

public class Test {
    public static void main(String[] args) {
        OldPhone o=new OldPhone();
        o.call();
        o.sendMessage();
        NewPhone n=new NewPhone();
        n.call();
        n.sendMessage();
        n.playGame();
    }
}
