/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class BankPayment extends Invoice
{
    /**
     deklarasi variabel
     */
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee)
    {
        super(id, jobs, jobseeker);
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
       int totalJobFee = 0;
       for (int i=0; i<getJobs().size();i++){
           totalJobFee = totalJobFee + getJobs().get(i).getFee();
       }
       if (getAdminFee() != 0){
           this.totalFee = (totalJobFee + getAdminFee());
       }
       else {
           this.totalFee = totalJobFee;
       }
    }

    public String toString()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String jobIn = "";
        for(int i=0; i<getJobs().size();i++){
            jobIn = jobIn + getJobs().get(i).getName() + " ";
        }
        return "\n==============INVOICE===============\n" +
                "ID: " + getId() +
                "\nJob: " + jobIn +
                "\nJobseeker: " + getJobseeker().getName() +
                "\nAdmin Fee: " + getAdminFee() +
                "\nTotal Fee: " + totalFee +
                "\nStatus: " + getInvoiceStatus() +
                "\nPayment Type: " + getPaymentType();
    }
}
