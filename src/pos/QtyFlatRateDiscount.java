package pos;

/**
 *
 * @author Jay
 */
public class QtyFlatRateDiscount implements DiscountStrategy {

    private double amountOff;
    private double minQty = 4;

    public QtyFlatRateDiscount(double amountOff) {
        this.amountOff = amountOff;
        
    }

    public double getAmountOff() {
        return amountOff;
    }

    public void setAmountOff(double amountOff) {
        this.amountOff = amountOff;
    }

    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }

    @Override
    public double getDiscount(double productCost, double qty) {

        if (qty >= minQty) {
            return (productCost * qty) - productCost;
        } else {

            return (productCost * qty);

        }
    }

    @Override
    public double getDiscountTotal(double productCost, double qty) {
        if (qty >= minQty) {
            return (productCost * qty) - productCost;
        } else {

            return productCost * qty;

        }

    }

}
