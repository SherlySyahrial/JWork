package Sherly.jwork;
import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
public class DatabaseJobseeker
{
    /** Mendefinisikan variabel */
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE=new ArrayList<Jobseeker>();
    private static int lastId = 0;

    /**
     * method getter database jobseeker
     * @return seluruh database jobseeker
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker(){
        return JOBSEEKER_DATABASE;
    }

    /**
     * method getter id jobseeker terakhir
     * @return id jobseeker terakhir
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * method getter jobseeker menggunakanid
     * @param id
     * @return jobseeker yang dicari
     * @throws JobSeekerNotFoundException
     */
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
    /**
     * method untuk menambah jobseeker baru
     * @param jobseeker
     * @return true jika berhasil ditambah
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

    /**
     * method untuk login jobseeker
     * @param email
     * @param password
     * @return jobseeker yang baru login
     */
    public static Jobseeker jobseekerLogin(String email, String password)
    {
        for (int i=0; i < JOBSEEKER_DATABASE.size(); i++) {
            if(JOBSEEKER_DATABASE.get(i).getEmail().equals(email) && JOBSEEKER_DATABASE.get(i).getPassword().equals(password)){
                return JOBSEEKER_DATABASE.get(i);
            }
        }
        return null;
    }

    public static void registerJobseeker(Jobseeker jobseeker) {
    }
}