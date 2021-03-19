/**
 *
 * @author Sherly
 * @version (18-03-2021)
 */
public class Jwork{
    
    public static void main (String[] args){
        Location location1 = new Location(" ", " ", " ");
        Recruiter recruite1 = new Recruiter(1, "test", "test", "test", location1);
        Job job1 = new Job(1, 2, " ", " ", recruite1);
        Jobseeker jobseeker1 = new Jobseeker(1, " ", " ", " ", " ");
        Invoice invoice1 = new Invoice(1, 2, " ", 3, jobseeker1);
        
    location1.setProvince("jakarta");
    recruite1.setName("Sherly");
    job1.setFee(50000);
    jobseeker1.setName("Syahrial");
    invoice1.setTotalFee(100000);
    
    location1.printData();
    recruite1.printData();
    jobseeker1.printData();
}     
}