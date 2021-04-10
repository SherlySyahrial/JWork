/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
public class BankPayment extends Invoice
{
    /**
     deklarasi variabel
    */
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;
        
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker,invoiceStatus);
    }

    public BankPayment(int id, Job job, Jobseeker jobseeker, int adminFee, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker,invoiceStatus);
        this.adminFee = adminFee;
    }
    
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
       
    public int getAdminFee()
    {
        return adminFee;
    }
        
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }
    
    @Override
    public void setTotalFee()
    {
        if (adminFee != 1)
        {
            super.totalFee = super.getJob().getFee() - getAdminFee();
        }
        
        else
        {
            super.totalFee = super.getJob().getFee();
        }
    }
        
    public String toString()
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
