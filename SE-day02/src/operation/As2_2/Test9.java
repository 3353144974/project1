package operation.As2_2;

public class Test9 {
    public static void main(String[] args) {
        String[] arr= new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] arr1= new String[]{"黑桃","红桃","梅花","方块"};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr1[i]+arr[j]+" ");
            }
            System.out.println();
        }

    }
}
