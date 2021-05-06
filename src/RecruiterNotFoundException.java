/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

public class RecruiterNotFoundException extends Exception {
    private int recruiter_error;
    public RecruiterNotFoundException (int recruiter_input) {
        super ("Recruiter ID: ");
    }
    public String getMassage() {
        return super.getMessage() + recruiter_error + "not found";
    }
}