package pos;

/**
 *
 * @author Jay
 */
public class QtyFlatRateDiscount implements DiscountStrategy {

    private double productCost;
    private double minQty;

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }

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

}
