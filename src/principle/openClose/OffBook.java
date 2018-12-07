/**
 * Author by wy, Email wyyallen@163.com, Date on 2018/12/7.
 */
package principle.openClose;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.EventListener;

public class OffBook extends Book{
    /**
     * 原价大于40元，打9折
     */
    private static final int TEN_PERCENT_OFF_LINE = 4000;
    private static final int HUNDRED = 100;
    private static final int TWENTY_PERCENT_OFF = 80;
    private static final int TEN_PERCENT_OFF = 90;
    public OffBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if (selfPrice > TEN_PERCENT_OFF_LINE){
            offPrice = selfPrice * TEN_PERCENT_OFF/HUNDRED;
        }else {
            offPrice = selfPrice * TWENTY_PERCENT_OFF/HUNDRED;
        }
        return offPrice;
    }
}
