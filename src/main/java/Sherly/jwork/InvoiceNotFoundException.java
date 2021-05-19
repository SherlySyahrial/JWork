/**
 *
 * @author Sherly
 * @version (08-05-2021)
 */
package Sherly.jwork;
public class InvoiceNotFoundException extends Exception {
    private int invoice_error;
    public InvoiceNotFoundException (int invoice_input) {
        super ("Invoice ID: ");
    }
    public String getMassage() {
        return super.getMessage() + invoice_error + "not found";
    }
}
