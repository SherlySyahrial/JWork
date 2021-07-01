/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

package Sherly.jwork;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
public class EwalletPayment extends Invoice
{
    /**
     deklarasi variabel
     */
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * constructor object ewallet dengan bonus
     * @param id
     * @param jobs
     * @param jobseeker
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }

    /**
     * constructor object ewallet dengan bonus
     * @param id
     * @param jobs
     * @param jobseeker
     * @param bonus
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus)
    {
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }

    /**
     * method getter payment type
     * @return payment type
     */
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    /**
     * method getter bonus
     * @return bonus
     */
    public Bonus getBonus()
    {
        return bonus;
    }

    /**
     * method setter bonus
     * @param bonus
     */
    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }

    /**
     * method setter total fee untuk menghitung gaji dengan bonus atau tidak
     */
    @Override
    public void setTotalFee()
    {
        if (bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            super.totalFee += bonus.getExtraFee();
        }
    }

    /**
     * method toString untuk mencetak data invoice ewallet
     */
    @Override
    public String toString() {
        Date date = getDate().getTime();
        String strDate = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            strDate = dateFormat.format(date);
        }
        String str = "====== Ewallet Payment ======" +
                "\nID : " + getId() +
                "\nJobs : " + getJobs() +
                "\nDate : " + strDate +
                "\nSeeker : " + getJobseeker().getName();

        if (bonus.getReferralCode() != null &&
                bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            str += "\nReferral Code: " + bonus.getReferralCode();
        }
        str += "\nFee : " + totalFee +
                "\nStatus: " + getInvoiceStatus().toString() +
                "\nPayment Type : " + PAYMENT_TYPE.toString();
        return str;
    }
}
