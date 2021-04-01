/**
 *
 * @author Sherly
 * @version (01-04-2021)
 */
public abstract class Invoice
{
    /**
    Deklarasi Variable 
    */
    private int id;
    //private int idJob;
    private Job job;
    private String date;
    protected int totalFee;
    private Jobseeker jobseeker;
    //private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;

    /**
     * constructor dari invoice
     * @param id dari invoice
     * @param idJob dari invoice
     * @param date dari invoice
     * @param totalfee dari invoice
     * @param jobseeker dari jobseeker
     */
    public Invoice(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus) { 
        this.id = id;
        this.job = job;
        this.date = date;  
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
    }

    /**
    * getter id dari invoice
    * @return id dari invoice
    */
    public int getId(){
        return id;
    }
    
    /**
    * getter idjob dari invoice
    * @return idjob dari invoice
    */
    public Job getJob(){
        return job;
    }
    
    /**
    * getter date dari invoice
    * @return date dari invoice
    */
    public String getDate(){
        return date;
    }
    
    /**
    * getter totalfee dari invoice
    * @return totalfee dari invoice
    */
    public int getTotalFee(){
        return totalFee;
    }

    /**
    * getter jobseeker dari jobseeker
    * @return jobseeker dari jobseeker
    */
    public Jobseeker getJobseeker() { 
        return jobseeker; 
    }
    
    /**
    * getter paymentType dari paymentType
    * @return paymentType dari paymentType
    */
    public abstract PaymentType getPaymentType();

    /**
    * getter invoiceStatus dari invoiceStatus
    * @return invoiceStatus dari invoiceStatus
    */
    public InvoiceStatus getInvoiceStatus() { 
        return invoiceStatus; 
    }

    /**
    * setter jobseeker dari jobseeker
    * @param jobseeker dari jobseeker
    */
    public void setJobseeker(Jobseeker jobseeker) { 
        this.jobseeker = jobseeker; 
    }

    /**
    * setter invoiceStatus dari invoiceStatus
    * @param invoiceStatus dari invoiceStatus
    */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus) { 
        this.invoiceStatus = invoiceStatus; 
    }

    /**
    * setter id dari invoice
    * @param id dari invoice
    */
    public void setId(int id){ 
        this.id = id; 
    }
    
    /**
    * setter idjobs dari invoice
    * @param idjobs dari invoice
    */
    public void setJob(Job job){ 
        this.job = job; 
    }
    
    /**
    * setter date dari invoice
    * @param date dari invoice
    */
    public void setDate(String date){ 
        this.date = date; 
    }
    
    /**
    * setter totalfee dari invoice
    * @param totalfee dari invoice
    */
    public abstract void setTotalFee();
    //{ 
      //  this.totalFee = totalFee; 
    //}
     public void printData()
    {
        System.out.println("\n====INVOICE====");
        System.out.println("ID :" + getId());
        System.out.println("Job :" + getJob());
        System.out.println("Date :" + getDate());
        System.out.println("Seeker :" + jobseeker.getName());
        System.out.println("Fee :" + getTotalFee());
        System.out.println("Status :" + getInvoiceStatus());
    }
}