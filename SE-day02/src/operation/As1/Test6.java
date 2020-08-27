package operation.As1;

public class Test6 {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            int hundred=i/100;
            int ten=i/10%10;
            int digits=i%10;
            if((hundred*hundred*hundred+ten*ten*ten+digits*digits*digits)==i){
                System.out.println(i);
            }
        }
    }
}
