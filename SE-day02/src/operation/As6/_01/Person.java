package operation.As6._01;

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+"吃饭");
    }
    public void bed(){
        System.out.println(name+"睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Coder extends Person{
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }

    public void coding(){
        System.out.println(name+"敲代码");
    }
}
class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println(name+"上课");
    }
}
