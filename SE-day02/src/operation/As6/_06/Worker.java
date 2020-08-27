package operation.As6._06;

abstract class Worker {
    String gh;
    String name;
    double gz;

    public Worker(String gh, String name, double gz) {
        this.gh = gh;
        this.name = name;
        this.gz = gz;
    }

    public abstract void eat();
    public abstract void gongZ();
}
