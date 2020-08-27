package operation.As2_2;

public class Test7 {
    public static void equals(int[] arr, int[] arr1) {
        boolean flag = true;
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr1[i]) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if(i==arr1.length-1){
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i]+",");
        }
        System.out.println("]");
        System.out.println("是否一致:"+flag);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        equals(arr,arr1);
    }
}
