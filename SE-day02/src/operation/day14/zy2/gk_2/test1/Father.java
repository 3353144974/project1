package operation.day14.zy2.gk_2.test1;

public class Father {
    public void eat() throws ToothPainException{
        System.out.println("吃到一个石子");
        throw new ToothPainException();
    }
    public void drink(){
        System.out.println("喝什么都没有问题");
    }
}
