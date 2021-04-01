/**
 *
 * @author Sherly
 * @version (01-04-2021)
 */

public class EwalletPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
    }
    
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, Bonus bonus ,InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }

    public PaymentType getPaymentType() { 
        return PAYMENT_TYPE; 
    }
    
    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }
    
    public void setTotalFee(){
        totalFee = super.getJob().getFee();
        if(bonus!=null && bonus.getActive() && totalFee > bonus.getMinTotalFee())
        totalFee += bonus.getExtraFee();
    }
    
    public void printData() {
        System.out.println("==================Ewallet Payment==================");
        System.out.println("paymentType : " + PAYMENT_TYPE);
        System.out.println("bonus : " + bonus);
    }
}
