/**
 *
 * @author Sherly
 * @version (27-03-2021)
 */
package Sherly.jwork;
public enum InvoiceStatus
{
    /**
     * inisiasi enum status invoice
     */
    OnGoing("On Going"),
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private String status;

    /**
     * constructor enum
     * @param status
     */
    private InvoiceStatus(String status)
    {
        this.status = status;
    }

    /**
     * method untuk mencetak status invoice
     */
    public String toString()
    {
        return status;
    }
}
