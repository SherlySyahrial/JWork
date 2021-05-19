package Sherly.jwork;
import java.util.ArrayList;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
public class DatabaseRecruiter
{
    // Mendefinisikan variabel
    private static ArrayList<Recruiter> RECRUITER_DATABASE;
    private static int lastId = 0;

    /* method untuk menambahkan objek pada database recruiter
     * @return nilai false
     */
    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter temp = null;
        try
        {
            for (Recruiter recruiter : RECRUITER_DATABASE)
            {
                if (id == recruiter.getId())
                {
                    temp = recruiter;
                }
            }
        }
        catch (Exception e)
        {
            throw new RecruiterNotFoundException(id);
        }
        return temp;
    }

    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException
    {
        for (Recruiter recruiter : RECRUITER_DATABASE)
        {
            if (recruiter.getId() == id)
            {
                RECRUITER_DATABASE.remove(recruiter);
                return true;
            }
        }
        throw new RecruiterNotFoundException(id);
    }

}