/**
 *
 * @author Sherly
 * @version (01-04-2021)
 */
public class BankPayment extends Invoice
{
    private int adminFee;
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;

    public BankPayment(int id, Job job, String date, int totalFee, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
    }
    
    public BankPayment(int id, Job job, String date, int totalFee, Jobseeker jobseeker, int adminFee ,InvoiceStatus invoiceStatus)
    {
        super(id, job, date, jobseeker, invoiceStatus);
        this.adminFee = adminFee;
    }

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
    
    public void setTotalFee(){
        if (adminFee != 0){
            totalFee = totalFee - adminFee;
        }
        else{
            totalFee = totalFee;
        }
    }
    
    public void printData() 
    {
        System.out.println(
            "===================== INVOICE =====================" +
            "\nID: " + getId() +
            "\nJob: " + getJob().getName() +
            "\nDate: " + getDate() +
            "\nJob Seeker: " + getJobseeker().getName()+
            "\nAdmin Fee: " +getAdminFee()+
            "\nTotal Fee: " + getTotalFee() +
            "\nStatus: " + getInvoiceStatus() +
            "\nPayment Type: " + PAYMENT_TYPE );
    }
}