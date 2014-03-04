package pos;

/**
 *
 * @author Jay
 */
public class LineItem {

    private double subTotal;
    private double grandTotal;
    private double taxRate = .056;
    private double quantity;
    FakeDatabase jay = new FakeDatabase();

    public double calculateTax(String productId) {
        return jay.findProduct(productId).getProductCost() * taxRate;
    }

    public double calculateGrandTotal(String productId) {
        return (jay.findProduct(productId).getProductCost() + calculateTax(productId));
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double qty) {
        this.quantity = qty;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

}
