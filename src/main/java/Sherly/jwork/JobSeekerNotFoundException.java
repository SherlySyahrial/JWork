/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class JobSeekerNotFoundException extends Exception {
    private int jobseeker_error;

    /**
     * constructor exception jobseeker not found
     * @param jobseeker_input
     */
    public JobSeekerNotFoundException (int jobseeker_input){
        super("Jobseeker ID : ");
        this.jobseeker_error = jobseeker_input;
    }

    /**
     * method untuk mencetak pesan error
     */
    public String getMassage() {
        return super.getMessage() + jobseeker_error + "not found";
    }
}