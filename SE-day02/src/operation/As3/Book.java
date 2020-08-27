package operation.As3;

public class Book {
    private String str;
    private String shum;
    private String bianm;
    private double jg;
    private String sj;
    public Book(){}
    public Book(String str,String shum,String bianm,double jg,String sj){
        this.str=str;
        this.shum=shum;
        this.bianm=bianm;
        this.jg=jg;
        this.sj=sj;
    }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getShum() {
        return shum;
    }

    public void setShum(String shum) {
        this.shum = shum;
    }

    public String getBianm() {
        return bianm;
    }

    public void setBianm(String bianm) {
        this.bianm = bianm;
    }

    public double getJg() {
        return jg;
    }

    public void setJg(double jg) {
        this.jg = jg;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj;
    }
    public void showBook(){
        System.out.println("最贵的书是："+str+","+shum+","+bianm+","+jg+","+sj);
    }
}
