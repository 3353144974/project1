package operation.day10._04;

public class Test {
    public static void main(String[] args) {
        Worker w=new Worker();
        Apple a1=new Apple(5,"青色");
        Apple a2=new Apple(3,"红色");
        Compare compare=new Compare();
        Apple compare1 = compare.compare(a1, a2);
        System.out.println("默认挑大的：");
        System.out.println(compare1.getSize()+"-"+compare1.getColor());
        Apple we=w.pickApple(new CompareAble() {
            @Override
            public Apple compare(Apple apple, Apple apple1) {
                return "红色"==apple.getColor()?apple:apple1;
            }
        }, a1, a2);
        System.out.println("挑红的：");
        System.out.println(we.getSize()+"-"+we.getColor());

    }
}
