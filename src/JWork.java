import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

public class JWork
{
    public static void main(String[] args) {

        Calendar cal = new GregorianCalendar(2021, 4, 20);
        Location location1 = new Location("Banten", "Tangerang", "Tempat Lahir");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Jonathan", "jonathan.sendiko@gmail.com", "085945644450", location1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Jonathan", "jonathan@ui.ac.id", "JonaTekkom123", 2021, 04, 22));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Jonathan", "jonathan@ui.ac.id", "JonaTekkom123", 2021, 04, 23));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ilham", "Ilham@ui.ac.id", "IMasdasda123", 2021, 03, 6));

        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        DatabaseJob.addJob(new Job(1, 10000, "Backend Engineer BukaLapak", JobCategory.UI, DatabaseRecruiter.getRecruiterById(1)));
        DatabaseJob.addJob(new Job(1, 20000, "Data Analyst Tokopedia", JobCategory.DataAnalyst, DatabaseRecruiter.getRecruiterById(1)));
        DatabaseJob.addJob(new Job(1, 10000, "Data Scientist Shopee", JobCategory.DataScientist, DatabaseRecruiter.getRecruiterById(1)));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));
    }

}
