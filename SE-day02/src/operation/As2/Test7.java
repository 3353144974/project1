package operation.As2;

public class Test7 {
    public static int round(double i){
        i+=0.5;
        return (int)i;
    }
    public static void main(String[] args) {
        System.out.println("10.1->"+round(10.1));
        System.out.println("10.4->"+round(10.4));
        System.out.println("10.5->"+round(10.5));
        System.out.println("10.9->"+round(10.9));

    }
}
