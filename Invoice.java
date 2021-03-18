/**
 * Write a description of class Jobseeker here.
 *
 * @author Sherly
 * @version (18-03-2021)
 */
public class Invoice
{
    private int id;
    private int idJob;
    private int totalFee;
    private String date;
    
    public Jobseeker jobseeker;

    public Invoice(int id, int idJob, int totalFee, String date, Jobseeker jobseeker)
    {
       this.id = id;
       this.idJob = idJob;
       this.totalFee = totalFee;
       this.date = date;
       this.jobseeker = jobseeker;
    }

    public int getId()
    {
        return this.id;
    }
    
    public int getIdJob()
    {
        return this.idJob;
    }
    
    public String getDate()
    {
        return this.date;
    }
    
    public int getTotalFee()
    {
        return this.totalFee;
    }
    
    public Jobseeker getJobseeker()
    {
        return this.jobseeker;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setIdJobs(int idJobs)
    {
        this.idJob = idJob;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public void setTotalFee(int totalFee)
    {
        this.totalFee = totalFee;
    }
    
    public void setJobseeker(Jobseeker jobseeker){}
    
    public void printData(){}
}
