/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */
package Sherly.jwork;
public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-wallet Payment"),;
    
    private String type;
    
    private PaymentType(String type)
    {
        this.type = type;
    }
    
    public String toString()
    {
        return type;
    }
}
