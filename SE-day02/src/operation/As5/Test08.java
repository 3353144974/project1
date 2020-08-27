package operation.As5;

public class Test08 {
    public static void main(String[] args) {
        String str="javajﬁewjavajﬁowfjavagkljjava";
        String ss="java";
        int num=0;
        String str1=str;
        while (str1.contains(ss)){
            str1=str1.substring(str1.indexOf(ss)+ss.length());
            num++;
        }
        System.out.println(str+"字符串中"+ss+"的数量:"+num);
    }
}
