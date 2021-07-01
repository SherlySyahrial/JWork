/**
 *
 * @author Sherly
 * @version (25-03-2021)
 */
package Sherly.jwork;
public enum JobCategory
{
    /**
     * inisiasi enum
     */
    WebDeveloper("Web Developer"),
    FrontEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst");
    
    private String name;

    /**
     * constructor enum
     * @param name
     */
    private JobCategory(String name)
    {
        this.name = name;
    }

    /**
     * method untuk mencetak category
     */
    public String toString()
    {
        return name;
    }
}
