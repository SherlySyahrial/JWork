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

    public static int getLastId(){
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id){
        for (int i=0; i < JOBSEEKER_DATABASE.size(); i++) {
            if(JOBSEEKER_DATABASE.get(i).getId() == id){
                return JOBSEEKER_DATABASE.get(i);
            }
        }
        return null;
    }
    /* method untuk menambahkan objek database job
     * @return nilai false
     */
    public static boolean addJobseeker(Jobseeker jobseeker) {
        for (Jobseeker js : JOBSEEKER_DATABASE)
        {
            if (js.getId() == jobseeker.getId()) return false;
            if (js.getEmail() == jobseeker.getEmail()) return false;
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    /**
     * method untuk menghapus objek database job
     * @return nilai false
     */
    public static boolean removeJobseeker(int id){
        for (int i=0; i < JOBSEEKER_DATABASE.size(); i++) {
            if(JOBSEEKER_DATABASE.get(i).getId() == id) {
                JOBSEEKER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }

}