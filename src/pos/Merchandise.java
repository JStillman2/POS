package pos;

/**
 *
 * @author Jay
 */
public class Merchandise {
    
    private String productId;
    private String productName;
    private double productCost;
    private DiscountStrategy discountStrategy;

    public Merchandise(String productId, String productName, double productCost, DiscountStrategy discountStrategy) {
        setProductId(productId);
        setProductName(productName);
        setProductCost(productCost);
        setDiscountStrategy(discountStrategy);
        
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    

    public String getProductId() {
        return productId;
    }

    public final void setProductId(final String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public final void setProductName(final String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public final void setProductCost(final double productCost) {
        this.productCost = productCost;
    }
    
    
    
    
}
