/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */

public enum JobCategory
{
    WebDeveloper("Web Developer"),
    FrontEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst"),;
    
    private String name;
    
    private JobCategory(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        return name;
    }
}
