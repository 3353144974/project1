package Saturday;

public class Lianxi2 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <100 ; i++) {
            if(i%2==1){
            sum+=i;
            }else {
                continue;
            }

        }
        System.out.println(sum);
    }
}
