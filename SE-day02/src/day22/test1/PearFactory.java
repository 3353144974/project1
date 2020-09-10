package day22.test1;

public class PearFactory implements FruitFactory1 {
    @Override
    public Fruit createFruit() {
        return new Pear();
    }
}
