/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

package Sherly.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {
    public static void main(String[] args) {
        Location l1= new Location("DKI Jakarta", "Jakarta", "Ibu Kota");
        Location l2= new Location("Jawa Barat", "Depok", "Hehe");
        Location l3= new Location("Sumatra Barat", "Padang", "Rendang");

        DatabaseRecruiter.addRecruiter(new Recruiter(1,"Sherly","sherly@gmail.com","081234567890",l1));
        DatabaseRecruiter.addRecruiter(new Recruiter(2,"Mili","mili@gmail.com","081234567890",l2));
        DatabaseRecruiter.addRecruiter(new Recruiter(3,"Milo","milo@gmail.com","081234567890",l3));

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, 900000, "Engineer", JobCategory.Devops, DatabaseRecruiter.getRecruiterById(1)));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, 900000, "Engineer", JobCategory.Devops, DatabaseRecruiter.getRecruiterById(2)));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1,900000, "Engineer", JobCategory.UI, DatabaseRecruiter.getRecruiterById(3)));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, 900000, "Engineer", JobCategory.UX, DatabaseRecruiter.getRecruiterById(3)));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        SpringApplication.run(JWork.class, args);
    }

}
