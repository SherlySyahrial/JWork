/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class RecruiterNotFoundException extends Exception {
    private int recruiter_error;
    public RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID : ");
        this.recruiter_error = recruiter_input;
    }
    public String getMassage() {
        return super.getMessage() + recruiter_error + "not found";
    }
}