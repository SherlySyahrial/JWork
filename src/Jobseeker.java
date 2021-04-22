/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
import java.util.Calendar;
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Jobseeker /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

 /**
 * constructor 
 * @param id id pada jobseeker
 * @param name nama pencari kerja pada jobseeker
 * @param email email pencari kerja pada jobseeker
 * @param password password dari jobseeker
 * @param joinDate tanggal join dari jobseeker 
 */
    public Jobseeker(int id,String name, String email, String password,Calendar joinDate){
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.joinDate = joinDate;
    }
    public Jobseeker(int id,String name, String email, String password,int year, int month, int dayOfMonth){
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.setJoinDate(year, month, dayOfMonth);
    }
    public Jobseeker(int id,String name, String email, String password){
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);        
    }
/**
 * getter id dari jobseeker 
 * @return id dari jobseeker 
 */ 
    public int getId(){
        return this.id;
    }
/**
 * getter nama pencari pekerjaan dari jobseeker
 * @return nama pencari pekerjaan dari jobseeker 
 */
    public String getName(){
        return this.name;
    }
/**
 * getter email pencari kerja pada jobseeker 
 * @return email pencari kerja pada jobseeker
 */
    public String getEmail(){
        return this.email;
    }
/**
 * getter password dari jobseeker
 * @return password dari jobseeker 
 */
    public String getPassword(){
        return this.password;
    } 
/**
 * getter tanggal join dari jobseeker  
 * @return tanggal join dari jobseeker 
 */
    public Calendar getJoinDate(){
        return this.joinDate;
    }
/**
 * setter id dari jobseeker 
 * @param id dari jobseeker 
 */
    public void setId(int id){ 
        this.id = id;
    }
/**
 * setter nama pencari pekerjaan dari jobseeker
 * @param nama pencari pekerjaan dari jobseeker 
 */
    public void setName(String name){ 
        this.name = name;
    }
/**
 * setter email pencari kerja pada jobseeker 
 * @param email pencari kerja pada jobseeker
 */
public void setEmail(String email) {
        Pattern pt = Pattern.compile("^(?!.*([.])\\1)[^.-][a-zA-Z0-9.&*_~]+@[^-. ][a-zA-Z0-9-.&*_~]+(?:\\.[a-zA-Z0-9-]+)*");
        Matcher mt = pt.matcher(email);
        if (mt.matches()) {
            this.email = email;
            return;
        }
        this.email = "";
    }
/**
 * setter password dari jobseeker
 * @param password dari jobseeker 
 */
    public void setPassword(String password){
        Pattern pt = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$");
        Matcher mt = pt.matcher(password);
        if (mt.matches()){
        this.password = password;
        return;
        }
        this.password = "";
    }
/**
 * setter tanggal join dari jobseeker  
 * @param tanggal join dari jobseeker 
 */
    public void setJoinDate(Calendar JoinDate){
        this.joinDate = joinDate;
    }
    public void setJoinDate(int year,int month,int dayOfMonth ){
         this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    } 

    public String toString(){
    String joindate = "";
    String pattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    if(joinDate != null){
        Date date = joinDate.getTime();
       joindate = simpleDateFormat.format(date);
}
    return "Id = " + id +
            "\nName = " + name +
            "\nEmail = " + email +
            "\nPassword = " + password +
            "\nJoin Date = " + joindate;
    }
    
    //public void printData(){
     //System.out.println("==== Job Seeker ====");
     //System.out.println("Id: " + getId());
     //System.out.println("Name: " + getName());
     //System.out.println("Email: " + getEmail());
     //System.out.println("Password: " + getPassword());
     //System.out.println("Join: " + getJoinDate());
    //}
}

