package operation.As3;

public class Test5 {
    public static void main(String[] args) {
        Book book1=new Book("No0001","JavaWed实战","isbn387648797524",58.8,"2017-01-01");
        Book book2=new Book("No0002","JavaWed实战","isbn387648797524",58.7,"2017-01-01");
        Book book3=new Book("No0003","JavaWed实战","isbn387648797524",58.6,"2017-01-01");
        if(book1.getJg()>book2.getJg()&&book1.getJg()>book3.getJg()){
            book1.showBook();
        }else if(book2.getJg()>book3.getJg()){
            book2.showBook();
        }else {
            book3.showBook();
        }
    }


}
