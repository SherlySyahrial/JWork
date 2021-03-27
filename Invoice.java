/**
 *
 * @author Sherly
 * @version (27-03-2021)
 */
public class Invoice
{
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus status;
    
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, int totalPrice, InvoiceStatus status){
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker; 
        this.paymentType = paymentType;
        this.status = status;
    }
    
    public int getId(){
        return id;
    }
    
    public int getIdJob(){
        return idJob;
    }
    
    public String getDate(){
        return date;
    }
    
    public int getTotalFee(){
        return totalFee;
    }
    
    public Jobseeker getJobseeker(){
        return jobseeker;
    }   
    
    public PaymentType getpaymentType(){
        return paymentType;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return status;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setIdJob(int idJob){     
        this.idJob = idJob;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
    public void setPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }
    public void setInvoiceStatus(InvoiceStatus status){
        this.status = status;
    }
     public void printData()
    {
        System.out.println("\n====INVOICE====" +
            "\nID: " + id +
            "\nIDJob: " + idJob +
            "\nDate: " + date +
            "\nSeeker: " +  jobseeker.getName() +
            "\nFee: " + totalFee +
            "\nStatus: " + status.toString());
    }
}