/**
 *
 * @author Sherly
 * @version (18-03-2021)
 */
public class Recruiter
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    public Recruiter(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
         return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setId(int id){
         this.id = id;
    }
    public void setName(String name){
         this.name = name;       
    }
    public void setEmail(String Email){
        this.email = email;
    }
    public void setPhoneNumber(String PhoneNumber){
        this.phoneNumber= phoneNumber;
    }
    public void printData(){
        System.out.println("Nama Perekrut: " + getName());
    }
}