import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Sherly
 * @version (08-04-2021)
 */
public class Jobseeker
{
    private int id;
    private String name;
    private String email;
    private String password;
    public Calendar joinDate;
    
    /** ctor untuk inisialisasi variabel */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.joinDate = joinDate;
    }
    
    /** ctor untuk inisialisasi variabel */
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.setJoinDate(year,month,dayOfMonth);
    }
    
    /** ctor untuk inisialisasi variabel */
    public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.joinDate = new GregorianCalendar();
    }
    
    /**
     * akses nomor id entri jobseeker
     */
    public int getId()
    {
        return id;
    }
     /**
     * akses nama entri jobseeker
     */
    public String getName()
    {
        return name;
    }
    /**
     * akses email entri jobseeker
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * akses password entri jobseeker
     */
    public String getPassword()
    {
        return password;
    }
    /**
     * akses tanggal entri jobseeker
     */
    public Calendar getJoinDate()
    {
        return joinDate;
    }
    /**
     * mutasi id jobseeker
     */
    public void setId(int id)
    {
        this.id = id;
    }
     /**
     * mutasi nama jobseeker
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * mutasi email jobseeker
     */
    public void setEmail(String email)
    {
        Pattern pt = Pattern.compile("[\\w]*[@[\\w]{1}[-\\w\\S]*");
        Matcher mt = pt.matcher(email);
        if (mt.matches()) {
            this.email = email;
        }
    }
   
    /**
     * mutasi password jobseeker
     */
    public void setPassword(String password)
    {
        Pattern pt = Pattern.compile("[\\w]*[@[\\w]{1}[-\\w\\S]*");
        Matcher mt = pt.matcher(password);
        if (mt.matches()) {
            this.password = password;
        }
    }
    /**
     * mutasi tanggal jobseeker
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }
    /**
     * mutasi tanggal jobseeker
     */
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year,month,dayOfMonth);
    }
    
    public String toString(){
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = dataFormat.format(joinDate);
        
        return "Id = " + id +
                "\nName = " + name +
                "\nEmail = " + email +
                "\nPassword = " + password +
                "\nJoinDate = " + joinDate.toString();
     }
}
