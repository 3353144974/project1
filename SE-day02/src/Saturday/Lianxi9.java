package Saturday;

public class Lianxi9 {
    public static void main(String[] args) {
        int g=0;
        int s=0;
        int b=0;
        for (int i = 100; i < 1000; i++) {
            g=i%10;
            s=i/10%10;
            b=i/100;
            if(((g*g*g)+(s*s*s)+(b*b*b))==i){
                System.out.println(i);
            }
        }
    }
}
