/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class ReferralCodeAlreadyExistsException extends Exception {
    private int referral_error;

    /**
     * constructor exception
     * @param referral_input
     */
    public ReferralCodeAlreadyExistsException(Bonus referral_input) {
        super ("ReferralCode ID: ");
    }

    /**
     * method untuk mencetak pesan error
     */
    public String getMassage() {
        return super.getMessage() + referral_error + "already exists.";
    }
}