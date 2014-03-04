package pos;

/**
 *
 * @author Jay
 */
public class PercentDiscount implements DiscountStrategy {

    private double percent;
    private double productCost;

    public PercentDiscount(double percent) {
        setPercent(percent);
    }

    public double getPercent() {
        return percent;
    }

    public final void setPercent(double percent) {
        this.percent = percent;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }


    @Override
    public double getDiscount(double productCost, double qty) {
        return productCost * qty * percent;

    }

    @Override
    public double getDiscountedTotal(double productCost, double qty) {
        return productCost * qty - getDiscount(productCost, qty);

    }

}
