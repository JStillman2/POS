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

    public void setPercent(double percent) {
        this.percent = percent;
    }

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
        return productCost * qty * percent;

    }

    @Override
    public double getDiscountTotal(double productCost, double qty) {
        return productCost * qty - getDiscount(productCost, qty);

    }

//    public static void main(String[] args) {
//        PercentDiscount dis = new PercentDiscount();
//        double discountPercent = dis.getDiscount(100.00, 2);
//        System.out.println(discountPercent);
//    }
}
