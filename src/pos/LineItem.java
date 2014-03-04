package pos;

/**
 *
 * @author Jay
 */
public class LineItem {

    private double subTotal;
    private double quantity;
    FakeDatabase jay = new FakeDatabase();

   

    public double getSubTotal(String productId) {
        return jay.findProduct(productId).getProductCost() * quantity;
    }

   
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double qty) {
        this.quantity = qty;
    }

    

}
