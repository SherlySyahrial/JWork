/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class JobSeekerNotFoundException extends Exception {
    private int jobseeker_error;
    public JobSeekerNotFoundException (int jobseeker_input){
        super("Jobseeker ID : ");
        this.jobseeker_error = jobseeker_input;
    }
    public String getMassage() {
        return super.getMessage() + jobseeker_error + "not found";
    }
}