package operation.day10._04;

public class Compare implements CompareAble {
    @Override
    public Apple compare(Apple apple, Apple apple1) {
        return apple.getSize() > apple1.getSize() ? apple : apple1;
    }

}
