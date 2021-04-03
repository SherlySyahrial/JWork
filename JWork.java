/**
 *
 * @author Sherly
 * @version (03-04-2021)
 */
public class Jwork{
    
    public static void main (String[] args){
        Location location = new Location("DKI Jakarta", "Jakarta", "Ibu Kota");
        Recruiter recruite = new Recruiter(1, "Sherly", "sherly82@ui.ac.id", "0895637478937", location);
        Job job = new Job(1, 10000000, "Software Engineer", JobCategory.UI, recruite);
        Jobseeker jobseeker = new Jobseeker(1, "Digo", "Digo@gmail.com", "adadeh", "20 Maret 2021");
        AdminFee adminFee1 = new AdminFee(0, null, 10000, 20000, true);
        AdminFee adminFee2 = new AdminFee(0, "1234", 10000, 200000000, true);
        AdminFee adminFee3 = new AdminFee(0, "1234", 10000, 20000, true);
        PaymentType pay = PaymentType.BankPayment;
        BankPayment BP1 = new BankPayment(0, job, "01 April 2021", jobseeker, adminFee1, InvoiceStatus.OnGoing);
        BankPayment BP2 = new BankPayment(0, job, "01 April 2021", jobseeker, adminFee2, InvoiceStatus.OnGoing);
        BankPayment BP3 = new BankPayment(0, job, "01 April 2021", jobseeker, adminFee3, InvoiceStatus.OnGoing);
        BP1.setTotalFee();
        BP2.setTotalFee();
        BP3.setTotalFee();
        BP1.printData();
        BP2.printData();
        BP3.printData();

    }
}
        