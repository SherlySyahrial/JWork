/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class EmailAlreadyExistsException extends Exception {
    private Jobseeker jobseeker_error;

    /**
     * constructor exception
     * @param jobseeker_input error
     */
    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Recruiter ID: ");
        jobseeker_input = jobseeker_input;
    }

    /**
     * method getMessage untuk mencetak pesan error
     * @return error message
     */
    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + "Not Found";
    }
}