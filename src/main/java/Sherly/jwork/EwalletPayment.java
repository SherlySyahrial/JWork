/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EwalletPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        super(id, jobs, jobseeker);
    }

    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus){
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }

    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }

    public Bonus getBonus(){
        return bonus;
    }

    public void setBonus(Bonus bonus){
        this.bonus=bonus;
    }

    @Override
    public void setTotalFee() {
        //super.totalFee = getJob().getFee();
        if (bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            super.totalFee += bonus.getExtraFee();
        }
    }

    @Override
    public String toString()
    {
        String output="";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        for(Job j : getJobs()){
            if (bonus != null && (bonus.getActive() == true) && j.getFee() >= bonus.getMinTotalFee()) {
                output = "==== PAYMENT ====" + "\nID: " + getId() + "\nJob : " + j.getName() + "\nDate: " + sdf.format(getDate().getTime()) + "\nJobseeker: " + getJobseeker().getName() + "\nReferral code: " + bonus.getReferralCode() + "\nTotal Fee: " + getTotalFee() + "\nInvoice Status: " + getInvoiceStatus() + "\nPayment type: " + getPaymentType();
            }
            output = "==== PAYMENT ====" + "\nID: " + getId() + "\nJob : " + j.getName() + "\nDate: " + sdf.format(getDate().getTime()) + "\nJobseeker: " + getJobseeker().getName() + "\nTotal Fee: " + getTotalFee() + "\nInvoice Status: " + getInvoiceStatus() + "\nPayment type: " + getPaymentType();

        }
        return output;
    }

    @Override
    public int getOngoingInvoice() {
        return 0;
    }
}