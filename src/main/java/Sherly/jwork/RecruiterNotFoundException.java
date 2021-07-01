/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class RecruiterNotFoundException extends Exception {
    private int recruiter_error;

    /**
     * constructor exception
     * @param recruiter_input
     */
    public RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID : ");
        this.recruiter_error = recruiter_input;
    }

    /**
     * method untuk mencetak pesan error
     */
    public String getMassage() {
        return super.getMessage() + recruiter_error + "not found";
    }
}