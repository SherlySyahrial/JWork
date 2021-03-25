/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */
public class Job
{
    private int id;
    private int fee;
    private String name;
    private JobCategory category;
    private Recruiter recruiter;
    
    public Job(int id, int fee, String name, JobCategory category, Recruiter recruiter)
    {
        this.id = id;
        this.fee = fee;
        this.name = name;
        this.category = category;
        this.recruiter = recruiter;
    }
    
    public int getId()
    {
        return this.id;
    }

    public int getFee()
    {
        return this.fee;
    }
    
    public String getName()
    {
        return this.name;
    }

    public JobCategory getCategory()
    {
        return this.category;
    }
    
    public Recruiter getRecruiter()
    {
        return this.recruiter;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }
    
    public void setFee(int Fee)
    {
        this.fee = fee;
    }
    
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter;
    }
    
    public void printData(){
    System.out.println("=== JOB ===\n" +
            "ID: " + id +
            "\nName: " + name +
            "\nRecruiter: " + recruiter.getName() +
            "\nCity: " + recruiter.getLocation().getCity() +
            "\nFee: " + fee +
            "\nCategory: " + category.toString());
}
}
