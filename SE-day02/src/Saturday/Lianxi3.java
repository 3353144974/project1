package Saturday;

public class Lianxi3 {
    public static void main(String[] args) {
        double i=3000;
        int s=0;
        for(;;){
            i/=2;
            s++;
            if(i<5){
                System.out.println("i"+s+"次后会少于5米");
                break;
            }
        }
    }
}
