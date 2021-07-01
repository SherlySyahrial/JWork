/**
 *
 * @author Sherly
 * @version (08-05-2021)
 */
package Sherly.jwork;
public class OngoingInvoiceAlreadyExistsException extends Exception {
    private Invoice invoice_error;

    /**
     * constructor exception
     * @param invoice_input
     */
    public OngoingInvoiceAlreadyExistsException (Invoice invoice_input) {
        super ("Invoice ID: ");
    }

    /**
     * method untuk mencetak pesan error
     */
    public String getMassage() {
        return super.getMessage() + invoice_error + "already exists.";
    }
}
