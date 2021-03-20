/**
 *
 * @author Sherly
 * @version (18-03-2021)
 */
public class Jwork{
    
    public static void main (String[] args){
        Location location1 = new Location("DKI Jakarta", "Jakarta", "Ibu Kota");
        Recruiter recruite1 = new Recruiter(1, "Sherly", "sherly82A@ui.ac.id", "0895637478937", location1);
        Job job1 = new Job(1, 100, "Design", "Web Design", recruite1);
        Jobseeker jobseeker1 = new Jobseeker(1, "apala", "apala@gmail.com", "3421", "Februari 2000");
        Invoice invoice1 = new Invoice(1, 2, "15 September 2000", 3, jobseeker1);
        
    recruite1.setName("Geraldy");
    location1.printData();
    recruite1.printData();
    jobseeker1.printData();
}     
}