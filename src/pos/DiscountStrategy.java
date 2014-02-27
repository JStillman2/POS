

package pos;

/**
 *
 * @author Jay
 */
public interface DiscountStrategy {
    
    public abstract double getDiscount(double productCost, double qty);
    
    public abstract double getDiscountTotal(double productCost, double qty);
   
    public abstract double getProductCost();

    public abstract double getQty();

    public abstract void setProductCost(double productCost);

    public abstract void setQty(double qty);
    
}
