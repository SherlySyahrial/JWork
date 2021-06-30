/**
 *
 * @author Sherly
 * @version (08-05-2021)
 */
package Sherly.jwork;
public class OngoingInvoiceAlreadyExistsException extends Exception {
    private Invoice invoice_error;
    public OngoingInvoiceAlreadyExistsException (Invoice invoice_input) {
        super ("Invoice ID: ");
    }
    public String getMassage() {
        return super.getMessage() + invoice_error + "already exists.";
    }
}
