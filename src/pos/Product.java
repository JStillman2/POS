package pos;

/**
 *
 * @author Jay
 */
public class Product {

    private String productId;
    private String productName;
    private double productCost;
    private DiscountStrategy discountStrategy;

    public Product(String productId, String productName, double productCost, DiscountStrategy discountStrategy) {
        setProductId(productId);
        setProductName(productName);
        setProductCost(productCost);
        setDiscountStrategy(discountStrategy);

    }
    
    

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
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

    double getDiscountAmount(double price, double quantity) {
        return discountStrategy.getDiscount(price, quantity);
    }

    double getDiscountTotal(double price, double quantity) {
        return discountStrategy.getDiscountTotal(price, quantity);
    }   

}
