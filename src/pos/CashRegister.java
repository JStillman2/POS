
package pos;

/**
 *
 * @author Nicole
 */
public class CashRegister {
    
    
    FakeDatabase jay = new FakeDatabase();

    public void ScanItem(String productID) {
        jay.findProduct(productID);
}
}
