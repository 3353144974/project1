package operation.As3;


public class Teacher {
        private String name;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private int age;
        private String content;
        public Teacher(){

        }
        public Teacher(String name, int age){
            this.name=name;
            this.age=age;
        }
        public void eat(){
            System.out.println("年龄为"+age+"的"+name+"正在吃饭....");
        }
        public void teach(){
            System.out.println("年龄为"+age+"的"+name+"正在亢奋的讲着"+content+"的知识........");
        }
    public static void main(String[] args) {
    }
}
