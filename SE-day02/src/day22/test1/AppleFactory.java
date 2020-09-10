package day22.test1;

public class AppleFactory implements FruitFactory1 {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
