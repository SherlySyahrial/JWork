import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
public class DatabaseJob
{
    // Mendefinisikan variabel
    private static ArrayList<Job> JOB_DATABASE;
    private static int lastId = 0;

    /* getter objek Database Job
     * @return nilai null
    */

    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job temp = null;
        try
        {
            for (Job job : JOB_DATABASE)
            {
                if (id == job.getId())
                {
                    temp = job;
                }
            }
        }
        catch (Exception e)
        {
            throw new JobNotFoundException(id);
        }
        return temp;
    }

    public ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> temp = new ArrayList<>();
        for (int i=0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getRecruiter().getId() == recruiterId){
                temp.add(JOB_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> temp = new ArrayList<>();
        for (int i=0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getCategory() == category){
                temp.add(JOB_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }

    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    public static boolean removeJob(int id) throws JobNotFoundException
    {
        for (Job job : JOB_DATABASE)
        {
            if (job.getId() == id)
            {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        throw new JobNotFoundException(id);
    }
}