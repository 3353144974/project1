package operation.As2_2;

public class Test6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[arr.length-i-1]){
                flag=true;
            }else {
                flag=false;
                break;
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i]+",");
        }
        System.out.println("] 是否对称:"+flag);
    }
}
