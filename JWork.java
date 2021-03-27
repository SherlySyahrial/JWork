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
        PaymentType pay = PaymentType.BankPayment;
        Invoice invoice = new Invoice(1, job.getId(), "27/03/2021", job.getFee(), jobseeker, PaymentType.BankPayment, InvoiceStatus.OnGoing);
        
        
        invoice.printData();
    }
}
        