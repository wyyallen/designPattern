package principle.openClose;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private final static String SELL_BOOK_RECORD_TPL = "书籍名称：%s \t书籍作者：%s \t书籍价格： %s ";
    private static final double HUNDRED = 100.0;

    private final static List<Book> bookList = new ArrayList<Book>(){{
        add(new Book("天龙八部",3200,"金庸"));
        add(new Book("日常生活中的自我呈现",4030,"欧文"));
        add(new Book("Java 编程思想",9010,"金庸"));
        add(new Book("算法",10020,"罗伯特"));
    }};
    /*
    *//**
     * 书店需要打折销售时，也就是需求发生变化，我们能有三种方式来解决问题：
     * 1;修改基类，在基类上新增方法getOffPrice(),专门进行打折处理。
     * (但是基类应该时稳定可靠的，所以我们应该在设计基类之初就考虑多种情况，不应该经常发生改变。我觉得这种方法是应该放在基类的)
     * 2：修改Book类中的方法，直接在getPrice()中修改代码（但是有些场合是需要看原价的）
     * 3：扩展一个子类OffBook，覆写getPrice方法。只需要在导入数据时产生新的对象，修改最少。
     *//*
    private final static List<Book> bookList = new ArrayList<Book>(){{
        add(new OffBook("天龙八部",3200,"金庸"));
        add(new OffBook("日常生活中的自我呈现",4030,"欧文"));
        add(new OffBook("Java 编程思想",9010,"金庸"));
        add(new OffBook("算法",10020,"罗伯特"));
    }};*/

    public static void main(String[] args){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        numberFormat.setMaximumFractionDigits(2);
        System.out.println("书店售书记录：");
        for (Book book : bookList){
            System.out.println(String.format(SELL_BOOK_RECORD_TPL,book.getName(),book.getAuthor(),
                    numberFormat.format(book.getPrice()/HUNDRED)
                    ));
        }
    }
}
