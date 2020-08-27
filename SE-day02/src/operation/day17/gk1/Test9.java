package operation.day17.gk1;

public class Test9 {
    public static void main(String[] args) {
        //1. 定义一个求和方法sum,接收一个整形参数num
        // 2. 明确递归终止的条件
        // 3. 分析递归逻辑：1到n的和等于1到(n-1)的和再加n
        // 4. 开始递归
        System.out.println(Sum(150));
    }
    public static int Sum(int num){
        if(num<=1){
            return 1;
        }else {
            return num+Sum(--num);
        }
    }

}
