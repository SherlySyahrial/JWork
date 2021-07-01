/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */
package Sherly.jwork;
public enum PaymentType
{
    /** inisiasi enum */
    BankPayment("Bank Payment"),
    EwalletPayment("E-wallet Payment"),;
    
    private String type;

    /**
     * constructor enum
     * @param type
     */
    private PaymentType(String type)
    {
        this.type = type;
    }

    /**
     * method untuk mencetak payment type
     */
    public String toString()
    {
        return type;
    }
}
