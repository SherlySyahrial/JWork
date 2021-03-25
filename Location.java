/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */
public class Location
{
    private String province;
    private String city;
    private String description;

    public Location(String province, String city, String Description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }

    public String getProvince(){
        return province;
    }
    public String getCity(){
        return city;
    }
    public String getDescription(){
        return description;
    }
    
    public void setProvince(String province) { 
        this.province = province; 
    }
    
    public void setCity(String city) { 
        this.city = city; 
    }
    
    public void setDescription(String description) { 
        this.description=description; 
    }
    public void printData() {
        System.out.println("Provinsi" + getProvince());
    }
}
