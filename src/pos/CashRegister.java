
package pos;

/**
 *
 * @author Jay
 */
public class CashRegister {
    
    
    FakeDatabase jay = new FakeDatabase();
    Receipt receipt = new Receipt();
    LineItem line = new LineItem();

    public void ScanItem(String productID, double qty) {
        jay.findProduct(productID);
        line.setQuantity(qty);
}
    
     public void printReceipt(String productID) {
        receipt.outputReceipt(productID);
    }
}
