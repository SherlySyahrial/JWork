/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

package Sherly.jwork;
public class Job
{
    /**
     deklarasi variabel
     */
    private int id; //deklarasi variabel int
    private int fee; //deklarasi variabel int
    private String name;//deklarasi variabel String
    private Recruiter recruiter;
    private JobCategory category;

    /**
     * constructor dari job
     * @param id dari job
     * @param fee dari job
     * @param name dari job
     * @param category dari job
     * @param recruiter dari recruiter
     */
    public Job(int id, int fee, String name, JobCategory category, Recruiter recruiter)
    {
        this.id = id;
        this.fee = fee;
        this.name = name;
        this.category = category;
        this.recruiter = recruiter;
    }

    /**
     * getter id dari jobseeker
     * @return id dari jobseeker
     */
    public int getId()
    {
        return id;
    }

    /**
     * getter fee jobseeker
     * @return fee jobseeker
     */
    public int getFee()
    {
        return fee;
    }

    /**
     * getter nama jobseeker
     * @return name jobseeker
     */
    public String getName()
    {
        return name;
    }

    /**
     * getter kategori jobseeker
     * @return category jobseeker
     */
    public JobCategory getCategory()
    {
        return category;
    }

    /**
     * setter recruiter dari recruiter
     */
    public Recruiter getRecruiter()
    {
        return recruiter;
    }

    /**
     * setter id invoice
     * @param id invoice
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * setter nama invoice
     * @param name invoice
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * setter kategori invoice
     * @param category invoice
     */
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }

    /**
     * setter fee invoice
     * @param fee invoice
     */
    public void setFee(int fee)
    {
        this.fee = fee;
    }

    /**
     * setter rekruiter invoice
     * @param recruiter invoice
     */
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter;
    }

    /**
     * menampilkan hasil 
     */
    public String toString()
    {
        return"\n====Job====" +
                "\nID: " + id +
                "\nName: " + name +
                "\nRecruiter: " + recruiter.getName() +
                "\nCity: " + recruiter.getLocation().getCity() +
                "\nFee: " + fee +
                "\nCategory" + category.toString();
    }
}
