package operation.day21.test12;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test12 {

    public static void main(String[] args) throws Exception {
        Class<BookShelf> aClass = BookShelf.class;
        Method method = aClass.getMethod("showBook");
        Book book = method.getAnnotation(Book.class);
        if (null != book) {
            String name = book.value();
            double price = book.price();
            String[] authors = book.authors();

            System.out.println("书名：" + name);
            System.out.println("价格：" + price);
            System.out.println("作者：" + Arrays.toString(authors));
        } else {
            System.out.println("该方法没有这个注解");
        }
    }

}
