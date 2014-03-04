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
    
    private double receiptNumber = 0;    
    private double subTotal;
    private double salesTax;
    private double grandTotal;

    public double getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(double receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
    
    
    
}
