package pos;

/**
 *
 * @author Jay
 */
public class PercentDiscount implements DiscountStrategy {

    private double percent;
    private double productCost;
    private double qty;
    
            

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

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public double getDiscount(double productCost, double qty) {
        return productCost * qty * percent;

    }

    @Override
    public double getDiscountTotal(double productCost, double qty) {
        return productCost * qty - getDiscount(productCost, qty);

    }

}
