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

    private double grandTotal;
    private double taxRate = .056;
    FakeDatabase jay = new FakeDatabase();
    private final String storeName = "Kohl's";
    LineItem line = new LineItem();

    public double calculateTax(String productId) {
        return jay.findProduct(productId).getProductCost() * taxRate;
    }

    public double calculateGrandTotal(String productId) {
        return (jay.findProduct(productId).getProductCost() + calculateTax(productId));
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    DiscountStrategy discount;

    public void outputReceipt(String productId) {
        System.out.println("Thank you for shopping at " + storeName
                + "\n\nID   Item    Price   Qty     Subtotal   Discount\n"
                + jay.findProduct(productId).getProductId() + "    "
                + jay.findProduct(productId).getProductName() + "    "
                + jay.findProduct(productId).getProductCost() + "       "
                + line.getQuantity() + "     "
                + calculateGrandTotal(productId) + "         "
                + jay.findProduct(productId).getDiscountTotal(jay.findProduct(productId).getProductCost(), line.getQuantity()));
    }

}
