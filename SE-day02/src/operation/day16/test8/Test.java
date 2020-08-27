package operation.day16.test8;

public class Test {
    public static void main(String[] args) {
//        System.out.println(new DoubleColorBallUtil().create());
        HuiChang h=new HuiChang();
        Thread t=new Thread(h,"后门");
        Thread t2=new Thread(h,"前门");
        t.start();
        t2.start();
    }

}
