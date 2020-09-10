package day22.test2;

public class Test {
    public static void main(String[] args) {
        DirectionEnum[] values = DirectionEnum.values();
        DirectionEnum front = DirectionEnum.valueOf("FRONT");
        for (DirectionEnum value : values) {
            System.out.println(value);
        }
        System.out.println(front);
    }

}
