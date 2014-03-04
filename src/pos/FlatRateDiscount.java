package pos;

/**
 *
 * @author Jay
 */
public class FlatRateDiscount implements DiscountStrategy {

    private double amountOff;
    private double qty;

    public FlatRateDiscount(double amountOff) {
        setAmountOff(amountOff);

    }

    public double getAmountOff() {
        return amountOff;
    }

    public void setAmountOff(double amountOff) {
        this.amountOff = amountOff;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public double getDiscount(double productCost, double qty) {
        return amountOff;

    }

    @Override
    public double getDiscountTotal(double productCost, double qty) {
        return productCost * qty - amountOff;

    }

}
