/**
 *
 * @author Sherly
 * @version (08-05-2021)
 */
package Sherly.jwork;

public class InvoiceNotFoundException extends Exception {
    private int invoice_error;

    /**
     * constructor exception invoice not found
     * @param invoice_input error
     */
    public InvoiceNotFoundException (int invoice_input) {
        super ("Invoice ID: ");
    }

    /**
     * method getMessage untuk mencetak pesan error
     */
    public String getMassage() {
        return super.getMessage() + invoice_error + "not found";
    }
}
