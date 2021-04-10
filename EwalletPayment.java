/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
public class EwalletPayment extends Invoice
{
    /**
     deklarasi variabel
    */
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;
        
    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker,invoiceStatus);
    }

    public EwalletPayment(int id, Job job, Jobseeker jobseeker, Bonus bonus, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker,invoiceStatus);
        this.bonus = bonus;
    }
    
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
       
    public Bonus getBonus()
    {
        return bonus;
    }
        
    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }
    
    @Override
    public void setTotalFee()
    {
        if (bonus != null && bonus.getActive() && (super.totalFee > bonus.getMinTotalFee()))
        {
            super.totalFee += bonus.getExtraFee();
        }
        
        else
        {
            super.totalFee = super.getJob().getFee();
        }
    }
       
    public String toString()
    {
        if (bonus != null && bonus.getActive() && super.totalFee > bonus.getMinTotalFee() && bonus.getReferralCode() != null)
        {
            return"\n====Invoice====" +
            "\nID: " + "ID = "+ super.getId() +
            "\nJob = "+ super.getJob().getName() +
            "\nSeeker = "+ super.getJobseeker().getName() +
            "\nFee = "+ super.totalFee +
            "\nReferral Code = "+ bonus.getReferralCode() +
            "\nStatus = "+ super.getInvoiceStatus().toString()+
            "\nPayment Type = "+ PAYMENT_TYPE.toString();
        }
        
        else
        {
           return"\n====Invoice====" +
            "\nID: " + "ID = "+ super.getId() +
            "\nJob = "+ super.getJob().getName() +
            "\nSeeker = "+ super.getJobseeker().getName() +
            "\nFee = "+ super.totalFee +
            "\nStatus = "+ super.getInvoiceStatus().toString()+
            "\nPayment Type = "+ PAYMENT_TYPE.toString(); 
        }
    }
}
