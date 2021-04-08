/**
 *
 * @author Sherly
 * @version (01-04-2021)
 */
public class BankPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
    super(id, job, date, jobseeker, invoiceStatus);
    this.adminFee = 0;
    }
    
    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee){
    super(id, job, date, jobseeker, invoiceStatus);
    this.adminFee = adminFee;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE; 
    }
    public int getAdminFee(){
        return adminFee;
    }
    public void setAdminFee(int adminFee){
        this.adminFee = adminFee;
    }
    public void setTotalFee(){
        if(adminFee != 0){
           super.totalFee = super.getJob().getFee() - adminFee;
    }else{
        super.totalFee = super.getJob().getFee();
    }
    }
 
    @Override
    public void printData()
    {
        System.out.println("==========Invoice==========");
        System.out.println("ID: "+ super.getId());
        System.out.println("Job: "+ super.getJob().getName());
        System.out.println("Date: "+ super.getDate());
        System.out.println("Job Seeker: "+ super.getJobseeker().getName());
        System.out.println("AdminFee "+ adminFee);
        System.out.println("Total Fee: "+ super.totalFee);
        System.out.println("Status:  "+ super.getInvoiceStatus().toString());
        System.out.println("Payment Type: "+ PAYMENT_TYPE.toString());
    }
}
