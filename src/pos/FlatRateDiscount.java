
package pos;

/**
 *
 * @author Jay
 */
public class FlatRateDiscount implements DiscountStrategy {

    private double amountOff;
    private double productCost;
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
    public double getDiscount(double productCost, double qty){
        return amountOff;
        
    }
    
    @Override
    public double getDiscountTotal(double productCost, double qty) {
        return productCost * qty - amountOff;

    }
    
    
//    public static void main(String[] args) {
//        FlatRateDiscount dis = new FlatRateDiscount();
//        double discountPercent = dis.getDiscount(100.00, 2);
//        System.out.println(discountPercent);
//    }


    
}
