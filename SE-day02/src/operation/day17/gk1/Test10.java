package operation.day17.gk1;

public class Test10 {
    public static void main(String[] args) {
        //1. 定义一个求阶乘方法,接收一个整形参数num
        // 2. 明确递归终止的条件
        // 3. 分析递归逻辑：n的阶乘等于n*(n-1)的阶乘
        // 4. 开始递归
        System.out.println(jiecheng(10));
    }
    public static int jiecheng(int num){
        if(num<=1){
            return 1;
        }else {
            return num*jiecheng(--num);
        }
    }
}
