package function;

public class Test03 {
    public static String cj(int score){
        if(score<0|score>100){
            return "成绩有误";
        }else if(score>=90&score<=100){
            return "优秀";
        }else  if(score>=80&score<90){
            return "好";
        }else if(score>=70&score<80){
            return "良";
        }else if(score>=60&score<70){
            return "及格";
        }else{
            return "不及格";
        }
    }
    public static int lj(){
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2==1){
                sum+=i;
            }
        }
        return sum;
    }
    public static int bsh(){
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0&i%5==0){
                System.out.println(i);
                sum+=i;
            }
        }
    return sum;
    }
    public static String sxh(){
        String a="";
        for (int i = 100; i <1000 ; i++) {
            int hundred=i/100;
            int ten=i/10%10;
            int digits=i%10;
            if((hundred*hundred*hundred+ten*ten*ten+digits*digits*digits)==i){
                a+=i+"\n";
            }
        }
        return a;
    }
    public static String bs() {
        int count = 0;
        String a = "";
        for (int i = 1; i <= 60; i++) {
            if (i % 2 == 0) {
                a += i+" ";
                count++;
            }
            if (count % 5 == 0) {
                a += "\n";
            }
        }
        return a;
    }
    public static String xo(){
        String a="";
        for (int i = 1; i <=7 ; i++) {
            for (int j = 1; j <=7; j++) {
                if(i==j|(j+i)==8){
                    a+="O";
                }else {
                    a+="*";
                }

            }
            a+="\n";
        }
    return a;
    }
    public static void main(String[] args) {
//        test01:for (int i = 1; i <= 3; i++) {
//            test02:for (int j = 1; j <= 3; j++) {
//                if (i==2){
////                    break test01;
//                    continue test01;
//                }
//                System.out.print(i+"-"+j+"  ");
//            }
//            System.out.println();
//        }
        System.out.println(cj(10));
        System.out.println("1-100的奇数累加和："+lj());
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字之和:"+bsh());
        System.out.println(sxh());
        System.out.println(bs());
        System.out.println(xo());
        int[] arr=new int[]{1,2,3,4,5,9};
//        for (int min = 0,max=arr.length-1; min <max ; min++,max--) {
//            int temp=arr[min];
//            arr[min]=arr[max];
//            arr[max]=temp;
//        }
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.println(arr[i]+" ");
//        }
        int[] arr1={1,2,5,3,4,6,8,21,74};
        for (int i = 0; i < arr1.length-1; i++) {
            int num=arr1[i];
            int index=i;
            for (int j = i+1; j < arr1.length; j++) {
                if(num>arr1[j]){
                    num=arr1[j];
                    index=j;
                }
            }
            if(i!=index){
                int temp=arr1[i];
                arr1[i]=arr1[index];
                arr1[index]=temp;
            }
        }
    }
}
