package Sherly.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

public abstract class Invoice {
    /*
    inisiasi
    variable
    */
    private int id; //inisiasi variable integer
    private Calendar date; //inisiasi variable string
    private Jobseeker jobseeker; //inisasi variable dari class jobseeker
    private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;
    private ArrayList<Job> jobs;
    protected int totalFee;

    /**
     * constructor invoice
     * @param id dari pencari kerja
     * @param jobs dari pekerjaan
     * @param
     * @param jobseeker identitas dari class jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        this.id = id;
        this.jobs = jobs;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * getter id jobseeker
     * @return id dari jobseeker
     */
    public int getId (){
        return id;
    }

    /**
     * getter id job
     * @return job dari job
     */
    public ArrayList<Job> getJobs (){
        return jobs;
    }

    /**
     * getter tanggal
     * @return date tanggal
     */
    public Calendar getDate (){
        return date;
    }

    /**
     * getter gaji total
     * @return totalFee gaji total
     */
    public int getTotalFee (){
        return totalFee;
    }

    /**
     * getter identitas jobseeker
     * @return jobseeker identitas jobseeker
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }


    public abstract PaymentType getPaymentType();



    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    /**
     * setter id jobseeker
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * setter job pekerjaan
     * @param
     */
    public void setJobs(ArrayList<Job> jobs){
        this.jobs = jobs;
    }

    /**
     * setter tanggal
     * @param date
     */
    public void setDate(Calendar date){
        this.date = Calendar.getInstance();
    }

    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }

    /**
     * setter gaji total
     * @param
     */
    public abstract void setTotalFee();

    /**
     * setter identitas jobseeker
     * @param jobseeker identitas dari class jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }

    public void setInvoiceStatus(InvoiceStatus status){
        this.invoiceStatus = invoiceStatus.OnGoing;
    }
    /**
     * method printData
     */
    public abstract String toString(); /*{
        return "============ Invoice ============\n" +
                            "ID: " + getId() +
                            "\nID Job: " + getJob() +
                            "\nDate: " + getDate() +
                            "\nSeeker: " + jobseeker.getName() +
                            "\nFee: " + getTotalFee() +
                            "\nStatus: " + getInvoiceStatus();
    }*/

    public abstract int getOngoingInvoice();
}

