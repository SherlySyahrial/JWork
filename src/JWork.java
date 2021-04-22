import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
public class JWork
{
    public static void main (String[] args) {
        Location location1 = new Location("Banten", "Tangerang", "Tempat Lahir");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Jonathan", "jonathan.sendiko@gmail.com", "085945644450", location1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Jonathan", "jonathan@ui.ac.id", "JonaTekkom123", 2021, 04, 22));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Jonathan", "jonathan@ui.ac.id", "JonaTekkom123", 2021, 04, 23));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ilham", "Ilham@ui.ac.id", "IMasdasda123", 2021, 03, 6));

        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        DatabaseJob.addJob(new Job(1, "Backend Engineer BukaLapak", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.Backend));
        DatabaseJob.addJob(new Job(1, "Data Analyst Tokopedia", DatabaseRecruiter.getRecruiterById(1), 20000, JobCategory.DataAnalyst));
        DatabaseJob.addJob(new Job(1, "Data Scientist Shopee", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataScientist));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));
    }
}


