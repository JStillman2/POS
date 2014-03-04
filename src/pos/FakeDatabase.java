package pos;

/**
 *
 * @author Jay
 */
public class FakeDatabase {
    
    private Customer[] customers = {
        new Customer("Agent J"),
        new Customer("Agent K"),
        new Customer("Neo"),
        new Customer("James Bond"),
        new Customer("Austin Powers")
    };
        
    private Product[] products = {
        new Product("P90X", "Yoga Pants", 19.99, new PercentDiscount(.15)),
        new Product("J87S", "Footie PJ's", 24.95, new FlatRateDiscount(10)),
        new Product("N28S", "Women's Tanktop", 7.95, new QtyFlatRateDiscount(3)),
        new Product("S54A", "Toddler's Pants", 12.95, new FlatRateDiscount(4))
    };
    
    public final Product findProduct(final String productId) {
        Product product = null;
        // validation is needed for method parameter
        if (productId == null || productId.length() == 0) {
            System.out.println("Enter a valid product ID.");
        } else {
            for (Product p : products) {
                if (productId.equals(p.getProductId())) {
                    product = p;
                    break;
                }
            }
        }
        return product;
    }
    
}
