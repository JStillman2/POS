package pos;

/**
 *
 * @author Jay
 */
public class FlatRateDiscount implements DiscountStrategy {

    private double amountOff;
    

    public FlatRateDiscount(double amountOff) {
        setAmountOff(amountOff);

    }

    public double getAmountOff() {
        return amountOff;
    }

    public void setAmountOff(double amountOff) {
        this.amountOff = amountOff;
    }



    @Override
    public double getDiscount(double productCost, double qty) {
        return amountOff;

    }

    @Override
    public double getDiscountedTotal(double productCost, double qty) {
        return productCost * qty - amountOff;

    }

}
