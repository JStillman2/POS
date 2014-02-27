package pos;

/**
 *
 * @author Jay
 */
public class QtyFlatRateDiscount implements DiscountStrategy {

    
    private double productCost;
    private double qty;

//    public QtyFlatRateDiscount(double amountOff) {
//        setAmountOff(amountOff);
//
//    }


    @Override
    public double getProductCost() {
        return productCost;
    }

    @Override
    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    @Override
    public double getQty() {
        return qty;
    }

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public double getDiscount(double productCost, double qty) {

        if (qty >= 6) {
            return (productCost * qty) - productCost;
        } else {

            return 0;

        }
    }

    @Override
    public double getDiscountTotal(double productCost, double qty) {
        if (qty >= 6) {
            return (productCost * qty) - productCost;
        } else {

            return productCost * qty;

        }

    }

//    public static void main(String[] args) {
//        FlatRateDiscount dis = new FlatRateDiscount();
//        double discountPercent = dis.getDiscount(100.00, 2);
//        System.out.println(discountPercent);
//    }
}
