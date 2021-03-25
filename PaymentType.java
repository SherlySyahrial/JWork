/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */

public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-wallet Payment"),;
    
    private String name;
    
    private PaymentType(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        return name;
    }
}
