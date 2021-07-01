/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

package Sherly.jwork;
import java.util.ArrayList;
public class DatabaseJob
{
    /**
     * deklarasi variabel
     */
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    /**
     * getter detail pekerjaan
     *
     * @return null
     */
    public static ArrayList<Job> getJobDatabase()
    {
        return JOB_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException
    {
        for (int i=0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getId() == id){
                return JOB_DATABASE.get(i);
            }
        }
        throw new JobNotFoundException(id);
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
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

    /**
     * metode addJob dari DatabaseJob
     * @return false
     */
    public static boolean addJob(Job job)
    {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    /**
     * metode Removejob dari DatabaseJob
     * @return false
     */
    public static boolean removeJob(int id) throws JobNotFoundException
    {
        for (int i=0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getId() == id) {
                JOB_DATABASE.remove(i);
                return true;
            }
        }
        throw new JobNotFoundException(id);
    }
}