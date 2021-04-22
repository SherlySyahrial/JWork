/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
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
        if (adminFee != 1)
        {
            super.totalFee = super.getJobs().getFee() - getAdminFee();
        }

        else
        {
            super.totalFee = super.getJobs().getFee();
        }
    }

    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }
    /** memperbarui total fee berdasarkan bonus */
    public void setTotalFee() {
        //totalFee = getJob().getFee();
        if (adminFee != 0) {
            totalFee -= adminFee;
        }
    }

    public String toString()
    {
        Date date = getDate().getTime();
        String strDate = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
            strDate = dateFormat.format(date);
        }
        String str =    "====== Ewallet Payment ======" +
                "\nID           : " + getId() +
                "\nJobs         : " + getJobs() +
                "\nDate         : " + strDate +
                "\nSeeker       : " + getJobseeker().getName() +
                "\nFee : " + totalFee +
                "\nStatus       : " + getInvoiceStatus().toString() +
                "\nPayment Type : " + PAYMENT_TYPE.toString();
        return str;
    }
}
