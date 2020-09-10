package operation.day21.test10;


@MyAnno
public class Test10 {

    @MyAnno2(type = "python")
    private String name;

    @MyAnno3(type = "java", intArr = {11, 22, 33})
    public void test() {

    }
}
