package operation.As2;

public class Test4 {
    public static char getChar(int num){
        char ch=(char) num;
        if(ch>=97&ch<=122){
            return ch;
        }else if(ch>=65&ch<=90){
            return ch;
        }else if(ch>=48&ch<=57){
            return ch;
        }else {
            return ' ';
        }

    }
    public static void main(String[] args) {
        char aChar=getChar(100);
        System.out.println("字符:"+aChar);
    }
}
