/**
 *
 * @author Sherly
 * @version (27-03-2021)
 */
package Sherly.jwork;
public enum InvoiceStatus
{
    OnGoing("On Going"),
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private String status;
    
    private InvoiceStatus(String status)
    {
        this.status = status;
    }
    
    public String toString()
    {
        return status;
    }
}
