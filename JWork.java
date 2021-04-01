/**
 *
 * @author Sherly
 * @version (27-03-2021)
 */
public class Jwork{
    
    public static void main (String[] args){
        Location location = new Location("DKI Jakarta", "Jakarta", "Ibu Kota");
        Recruiter recruite = new Recruiter(1, "Sherly", "sherly82@ui.ac.id", "0895637478937", location);
        Job job = new Job(1, 10000000, "Software Engineer", JobCategory.UI, recruite);
        Jobseeker jobseeker = new Jobseeker(1, "Digo", "Digo@gmail.com", "adadeh", "20 Maret 2021");
        Bonus bonus1 = new Bonus(0, null, 10000, 20000, true);
        Bonus bonus2 = new Bonus(0, "1234", 10000, 200000000, true);
        Bonus bonus3 = new Bonus(0, "1234", 10000, 20000, true);
        PaymentType pay = PaymentType.BankPayment;
        EwalletPayment EP1 = new EwalletPayment(0, job, "01 April 2021", jobseeker,bonus1, InvoiceStatus.OnGoing);
        EwalletPayment EP2 = new EwalletPayment(0, job, "01 April 2021", jobseeker, bonus2, InvoiceStatus.OnGoing);
        EwalletPayment EP3 = new EwalletPayment(0, job, "01 April 2021", jobseeker, bonus3, InvoiceStatus.OnGoing);
        EP1.setTotalFee();
        EP2.setTotalFee();
        EP3.setTotalFee();
        EP1.printData();
        EP2.printData();
        EP3.printData();
    }
}
        