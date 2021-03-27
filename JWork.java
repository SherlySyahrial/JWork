/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */
public class Jwork{
    
    public static void main (String[] args){
        Location location = new Location("DKI Jakarta", "Jakarta", "Ibu Kota");
        Recruiter recruite = new Recruiter(1, "Sherly", "sherly82@ui.ac.id", "0895637478937", location);
        Job job = new Job(1, 10000000, "Software Engineer", JobCategory.UI, recruite);
        PaymentType pay = PaymentType.BankPayment;
        
        job.printData();
    }
}
        