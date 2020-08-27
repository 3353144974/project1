package Saturday;

public class Lianxi4 {
    public static void main(String[] args) {
        char a = 'α';
        for (int i = 0;; i++) {
            if((char)(a+i)=='ω'){
                System.out.println((char)(a+i));
                break;
            }
            System.out.println((char)(a+i));
        }
    }
}
