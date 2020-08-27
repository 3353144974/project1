package operation.day14.zy2.gk_1.test2;

public class Student {
    private String name;
     private Integer score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        if(score<0){
            throw new NoScoreException("分数不能为负数：XXX");
        }else {
            this.score = score;
        }

    }

    public Student() {
    }

    public Student(String name, Integer score) {
        setName(name);
        setScore(score);
    }
}
