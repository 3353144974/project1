package operation.As6._07;

public class Lecturer extends Teacher{

    public Lecturer() {
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println("工号为"+id+"的讲师"+name+"在讲课");
    }
}
