
/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

package Sherly.jwork;
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

    /**
     * constructor bank payment dengan admin fee
     * @param id
     * @param jobs
     * @param jobseeker
     * @param adminFee
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, int adminFee)
    {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }

    /**
     * method getter payment type
     * @return PAYMENT_TYPE
     */
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * method getter admin fee
     * @return admin fee
     */
    public int getAdminFee()
    {
        return adminFee;
    }

    /**
     * method setter admin fee
     * @param adminFee
     */
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }

    /**
     * method setter totalfee untuk menghitung total gaji
     */
    @Override
    public void setTotalFee()
    {
        for(Job job : getJobs()) {
            if(adminFee != 0) {
                totalFee = job.getFee() - getAdminFee();
            }
            else {
                totalFee = job.getFee();
            }
        }
    }

    /**
     * method toString untuk print hasil
     */
    public String toString()
    {
        SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM yyyy");
        String date1 = format1.format(getDate().getTime());
        String jobIn = "";
        for(int i=0; i<getJobs().size();i++){
            jobIn = jobIn + getJobs().get(i).getName() + " ";
        }

        return "\n================INVOICE================\n" +
                "ID: " + getId() +
                "\nJob: " + jobIn +
                "\nDate: " + date1 +
                "\nJobseeker: " + getJobseeker().getName() +
                "\nAdmin Fee: " + getAdminFee() +
                "\nTotal Fee: " + totalFee +
                "\nStatus: " + getInvoiceStatus() +
                "\nPayment Type: " + getPaymentType();
    }
}
