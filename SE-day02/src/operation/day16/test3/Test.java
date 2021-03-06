package operation.day16.test3;

public class Test {
    public static void main(String[] args) {
        invokeDirect(new Director() {
            @Override
            public void makeMovie() {
                System.out.println("导演拍电影啦!");
            }
        });
        invokeDirect(()->System.out.println("导演拍电影啦!"));
    }
    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
