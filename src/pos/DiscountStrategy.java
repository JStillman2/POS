package pos;

/**
 *
 * @author Jay
 */
public interface DiscountStrategy {
    
    public abstract double getDiscount(double productCost, double qty);
    
    public abstract double getDiscountedTotal(double productCost, double qty);
   
    

   
    
}
