package pos;

/**
 *
 * @author Jay
 */
public class POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        DiscountStrategy dis = new PercentDiscount(.05);
//        double discountPercent = dis.getDiscount(100.00, 2);
//        System.out.println(discountPercent);
//        
//        DiscountStrategy money = new FlatRateDiscount(10);
//        double discountOff = money.getDiscount(100.00, 2);
//        System.out.println(discountOff);
//        
//        DiscountStrategy dis2 = new PercentDiscount(.05);
//        double discountPercent2 = dis2.getDiscountTotal(100.00, 2);
//        System.out.println(discountPercent2);
//        
//        DiscountStrategy money2 = new FlatRateDiscount(10);
//        double discountOff2 = money2.getDiscountTotal(100.00, 2);
//        System.out.println(discountOff2);
        
        Product test = new Product("J101", "Socks", 5.0, new FlatRateDiscount(2));
        FlatRateDiscount flat = new FlatRateDiscount(2);
        double dis = flat.getDiscountTotal(5.0, 2);
        System.out.println(dis);

    }

}
