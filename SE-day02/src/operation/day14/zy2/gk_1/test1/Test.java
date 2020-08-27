package operation.day14.zy2.gk_1.test1;

public class Test {
    public static void main(String[] args) throws Exception {
        testThrows();
    }
    public static char charAt(String str, int index) throws Exception {
        if(str==null){
            throw new Exception("字符串不能为null");
        }else if (str.equals("")){
            throw new Exception("字符串不能为空");
        }else if(index<0||index>str.length()-1){
            throw new Exception("索引越界");
        }else {
            char c = str.charAt(index);
            return c;
        }
    }
    public static void testThrows()throws Exception{
        charAt("",1);
    }
    public static void testTryCatch(){
        try{
            charAt(null,2);
        }
        catch (Exception e){

        }
    }
}
