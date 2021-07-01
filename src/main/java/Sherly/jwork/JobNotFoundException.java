/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class JobNotFoundException extends Exception {
    private int job_error;

    /**
     * constructor exception job not found
     * @param job_input
     */
    public JobNotFoundException(int job_input){
        super("Job ID : ");
        this.job_error = job_input;
    }

    /**
     * method getmessage untuk mencetak pesan error
     */
    public String getMassage() {
        return super.getMessage() + job_error + "not found";
    }
}
