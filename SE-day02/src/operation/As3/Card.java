package operation.As3;

public class Card {
    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

    public String getShu() {
        return shu;
    }

    public void setShu(String shu) {
        this.shu = shu;
    }

    private String se;
    private String shu;
    public Card(String se,String shu){
        this.se=se;
        this.shu=shu;
    }
    public void showCard(){
        System.out.println(se+shu);
    }

}
