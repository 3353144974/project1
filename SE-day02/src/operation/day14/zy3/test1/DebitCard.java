package operation.day14.zy3.test1;

public class DebitCard {
private Integer accountNumber;
private Double money;

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) throws CardException {
        if(money<0){
            throw new CardException("余额不能为负");
        }
        this.money = money;
    }

    public DebitCard() {
    }

    public DebitCard(Integer accountNumber, Double money) throws CardException {
        setAccountNumber(accountNumber);
        setMoney(money);
    }
}
