package day22.test1;

public class FruitFactory {
    public Fruit createFruit(String type){
        if(type.equals("apple")){
            return new Apple();
        }else if(type.equals("pear")){
            return new Pear();
        }
        return null;
    }

}
