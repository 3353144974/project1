package operation.day10._03;

public class Receptionist {
    Filter filter;

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Receptionist() {
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void install(User u) {
        if(u.getYtpe()==null){
            for (int i = 0; i < 50; i++) {
                u.setYtpe("A");

            }
        }
        if(u.getYtpe()!=null){
            filter.ﬁlterUser(u);
        }

    }
}
