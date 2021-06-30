
/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

package Sherly.jwork;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public abstract class Invoice
{
    /**
     deklarasi variabel
     */
    private int id; //deklarasi variabel int
    protected int totalFee; //deklarasi variabel int
    private Calendar date; //deklarasi variabel String
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;
    private ArrayList<Job> jobs;

    /**
     * constructor dari invoice
     * @param id dari invoice
     * @param jobs dari invoice
     * @param jobseeker dari invoice
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        this.id = id;
        this.jobs = jobs;
        this.date = Calendar.getInstance();
        this.jobseeker = jobseeker;
        this.invoiceStatus = InvoiceStatus.OnGoing;
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
    public ArrayList<Job> getJobs()
    {
        return jobs;
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

    public void setJobs(ArrayList<Job> jobs)
    {
        this.jobs = jobs;
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
     * @param invoiceStatus dari invoice
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
