package principle.openClose;

public class Book {

    private String name;
    /**
     * 非金融类项目中对货币处理时，一般取两位精度通常设计方法是在运算过程中扩大100倍，在需要展示时再缩小100倍
     */
    private int price;
    private String author;

    public Book(String name,int price,String author){
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
