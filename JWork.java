/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */
public class Jwork{
    
    public static void main (String[] args){
        Location location1 = new Location("DKI Jakarta", "Jakarta", "Ibu Kota");
        Recruiter recruite1 = new Recruiter(1, "Sherly", "sherly82@ui.ac.id", "0895637478937", location1);
        Job job1 = new Job(1, 10000000, "Software Engineer", JobCategory.UI, recruite1);
        PaymentType pay1 = PaymentType.BankPayment;
        
        job1.printData();
    }
}
        