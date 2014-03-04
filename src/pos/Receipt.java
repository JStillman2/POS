/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;

/**
 *
 * @author Jay
 */
public class Receipt {
    
    FakeDatabase db = new FakeDatabase();
    private final String storeName = "Kohl's";
    LineItem line = new LineItem();    

    
    DiscountStrategy discount;
    public void outputReceipt(String productId) {
        System.out.println("Thank you for shopping at " + storeName
                            + "\n\nID   Item    Price   Qty     Subtotal   Discount\n"
                            + db.findProduct(productId).getProductId() + "    "
                            + db.findProduct(productId).getProductName() +  "    "
                            + db.findProduct(productId).getProductCost() + "       "
                            + line.getQuantity()+ "     "
                            + line.calculateGrandTotal(productId) + "         "
                            + db.findProduct(productId).getDiscountTotal(db.findProduct(productId).getProductCost(), line.getQuantity()));
    }
    

    
}
