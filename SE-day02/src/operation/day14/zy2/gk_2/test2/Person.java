package operation.day14.zy2.gk_2.test2;

public class Person {
    private String name;
    private Integer lifeValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(Integer lifeValue){
        if(lifeValue<0){
            throw new NoLifeValueExption("生命值不能为负数:xxx");
        }
        this.lifeValue = lifeValue;
    }

    public Person() {
    }

    public Person(String name, Integer lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }
}
