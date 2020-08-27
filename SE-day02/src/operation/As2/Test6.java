package operation.As2;

public class Test6 {
    public static void printX(int a){
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=a; j++) {
                if(i==j|(j+i)==a+1){
                    System.out.print("O");
                }else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printX(10);
    }
}
