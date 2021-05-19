/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */
package Sherly.jwork;
public class Recruiter
{
    /**
     deklarasi variabel
    */
    private int id; //deklarasi variabel int
    private String name; //deklarasi variabel String
    private String email; //deklarasi variabel String
    private String phoneNumber; //deklarasi variabel String
    public Location location;
    
    /**
     * constructor dari recruiter
     * @param id dari recruiter
     * @param name dari recruiter
     * @param email dari recruiter
     * @param phoneNumber dari recruiter
     * @param location dari location
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
    * getter id dari recruiter
    * @return id dari recruiter
    */
   public int getId()
    {
        return id;
    }
    
    /**
    * getter nama dari recruiter
    * @return name dari recruiter
    */
   public String getName()
    {
        return name;
    }
    
    /**
    * getter email dari recruiter
    * @return email dari recruiter
    */
   public String getEmail()
    {
        return email;
    }
    
    /**
    * getter nomor telepon dari recruiter
    * @return phonenumber dari recruiter
    */
   public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
    * getter lokasi dari recruiter
    * @return location dari recruiter
    */
   public Location getLocation()
    {
        return location;
    }
    
    /**
    * setter id recruiter
    * @param id recruiter
    */
   public void setId(int id)
    {
        this.id = id;
    }
    
    /**
    * setter email recruiter
    * @param email recruiter
    */
   public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
    * setter nama recruiter
    * @param name recruiter
    */
   public void setName(String name)
    {
        this.name = name;
    }
    
    /**
    * setter nomor telepon recruiter
    * @param phonenumber recruiter
    */
   public void setPhoneNumber(String phonenumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    /**
    * setter lokasi recruiter
    * @param location recruiter
    */
   public void setLocation(Location location)
    {
        this.location = location;
    }

    
    /**
     * menampilkan nama perekrut dari recruiter
     */
   public String toString(){ 
        return "====Recruiter===="+
               "\nId = " + id +
                "\nName = " + name +
                "\nPhoneNumber = " + phoneNumber +
                "\nLocation = " + location.getCity();

    }
}
