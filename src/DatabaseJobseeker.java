import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
public class DatabaseJobseeker
{
    // Mendefinisikan variabel
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE;
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getDatabaseJobseeker(){
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        Jobseeker temp = null;
        try
        {
            for (Jobseeker jobseeker : JOBSEEKER_DATABASE)
            {
                if (id == jobseeker.getId())
                {
                    temp = jobseeker;
                }
            }
        }
        catch (Exception e)
        {
            throw new JobSeekerNotFoundException(id);
        }
        return temp;
    }
    /* method untuk menambahkan objek database job
     * @return nilai false
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker js : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail() == js.getEmail()) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    /**
     * method untuk menghapus objek database job
     * @return nilai false
     */
    public static Jobseeker removeJobseeker(int id) throws JobSeekerNotFoundException {
        Jobseeker temp = null;
        try {
            for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
                if (id == jobseeker.getId()) {
                    temp = jobseeker;
                }
            }
        } catch (Exception e) {
            throw new JobSeekerNotFoundException(id);
        }
        return temp;
    }
}