package operation.As4;

import java.util.*;
import java.util.Scanner;

public class Book {
    private String title;
    private String isbn;
    private double price;
    public Book() {
    }
    public Book(String title, String isbn, double price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String str="";
            for (int i = 1; i <= 3; i++) {
                Book b=new Book();
                System.out.println("请录入第"+i+"本书的名称：");
                b.setTitle(sc.next());
                System.out.println("请录入第"+i+"本书的ISBN编码：");
                b.setIsbn(sc.next());
                System.out.println("请录入第"+i+"本书的价格：");
                b.setPrice(sc.nextDouble());
                list.add(b);
            }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).title+","+list.get(i).isbn+","+list.get(i).price);
        }

    }

}
