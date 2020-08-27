package operation.day12.test10;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        String[] str = {"a", "b", "c", "d", "e", "f"};
        t.swap(str, 2, 5);
        Integer[] arr = {1, 2, 3, 5, 56, 4, 8};
        t.swap(arr, 2, 5);
    }

    public <E> void swap(E[] e, int i, int j) {
        E num;
        num = e[i];
        e[i] = e[j];
        e[j] = num;
        System.out.println(e[i]);
        System.out.println(e[j]);
    }

}
