package day22.test2;

public enum DirectionEnum {
    FRONT("front"),
    BEHIND("behind"),
    LEFT("left"),
    RIGHT("right")
    ;
    private String name;

    DirectionEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
