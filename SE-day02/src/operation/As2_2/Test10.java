package operation.As2_2;

public class Test10 {
    public static void main(String[] args) {
        int[] arr={99, 100, 98, 97, 96};
        int min=99;
        int max=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("最终得分："+((sum-min-max)/(arr.length-2)));
    }
}
