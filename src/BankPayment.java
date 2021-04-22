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
            super.totalFee = super.getJobs().getFee;
        }
    }

    public String toString()
    {
        return"\n====Invoice====" +
                "\nID: " + "ID = "+ super.getId() +
                "\nJobs = "+ super.getJobs() +
                "\nSeeker = "+ super.getJobseeker().getName() +
                "\nFee = "+ super.totalFee +
                "\nStatus = "+ super.getInvoiceStatus().toString()+
                "\nPayment Type = "+ PAYMENT_TYPE.toString();
    }
}
