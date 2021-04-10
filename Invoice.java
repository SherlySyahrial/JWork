/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public abstract class Invoice
{
    /**
     deklarasi variabel
    */
    private int id; //deklarasi variabel int
    //private int idJob; //deklarasi variabel int
    protected int totalFee; //deklarasi variabel int
    private Calendar date; //deklarasi variabel String
    private Jobseeker jobseeker;
   // public PaymentType paymentType;
    private InvoiceStatus invoiceStatus;
    private Job job;

    /**
     * constructor dari invoice
     * @param id dari invoice
     * @param job dari invoice
     * @param date dari invoice
     * @param totalfee dari invoice
     * @param jobseeker dari invoice
     * @param paymentType dari invoice
     * @param status dari invoice
     */
    public Invoice(int id, Job job, Jobseeker jobseeker, InvoiceStatus status)
    {
       this.id = id;
       this.job = job;
       //this.totalFee = totalFee;
       //this.date = date;
       this.jobseeker = jobseeker;
       //this.paymentType = paymentType;
       this.invoiceStatus = invoiceStatus;
    }

    /**
    * getter id dari invoice
    * @return id dari invoice
    */
   public int getId()
    {
        return id;
    }
    
    /**
    * getter job invoice
    * @return job invoice
    */
   public Job getJob()
    {
        return job;
    }
    
    /**
    * getter tanggal dari invoice
    * @return date dari invoice
    */
   public Calendar getDate()
    {
        return date;
    }
    
    /**
    * getter jumlah biaya dari invoice
    * @return totalfee dari invoice
    */
   public int getTotalFee()
    {
        return totalFee;
    }
    
   /**
    * getter tipe pembayaran dari invoice
    */
   public abstract PaymentType getPaymentType();
    
   /**
    * getter status dari invoice
    * @return status dari invoice
    */
   public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    } 
    
    /**
    * getter jobseeker dari invoice
    * @return jobseeker dari invoice
    */
   public Jobseeker getJobseeker()
    {
        return jobseeker;
    }
    
    /**
    * setter id dari invoice
    * @param id dari invoice
    */
   public void setId(int id)
    {
        this.id = id;
    }
    
    /**
    * setter idjob dari invoice
    * @param idjob dari invoice
    */
   public void setJob(Job job)
    {
        this.job = job;
    }
    
    /**
    * setter tanggal dari invoice
    * @param date dari invoice
    */
   public void setDate(Calendar date)
    {
        this.date = date;
    }
    
   public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    
   public abstract void setTotalFee();
       
    /**
    * setter jobseeker dari invoice
    * @param jobseeker dari invoice
    */
   public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker = jobseeker;
    }
    
    /**
    * setter tipe pembayaran dari invoice
    * @param paymentType dari invoice
    */
   //public void setPaymentType(PaymentType paymentType);   
    
    /**
    * setter status dari invoice
    * @param status dari invoice
    */
   public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }
    
    /**
     * Menampilkan jumlah harga
     */
    public abstract String toString();
   
}
