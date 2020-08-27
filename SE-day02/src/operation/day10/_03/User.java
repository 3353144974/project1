package operation.day10._03;

public class User {
    String ytpe;
   int id;
   public User(int id){
       this.id = id;
   }
    public User(String ytpe, int id) {
        this.ytpe = ytpe;

    }

    public User() {
    }

    public String getYtpe() {
        return ytpe;
    }

    public void setYtpe(String ytpe) {
        this.ytpe = ytpe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
