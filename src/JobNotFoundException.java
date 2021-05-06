/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

public class JobNotFoundException extends Exception {
    private int job_error;
    public JobNotFoundException (int job_input) {
        super ("Job ID: ");
    }
    public String getMassage() {
        return super.getMessage() + job_error + "not found";
    }
}
