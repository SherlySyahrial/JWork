/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */
package Sherly.jwork;
public class ReferralCodeAlreadyExistsException extends Exception {
    private int referral_error;
    public ReferralCodeAlreadyExistsException(Bonus referral_input) {
        super ("ReferralCode ID: ");
    }
    public String getMassage() {
        return super.getMessage() + referral_error + "already exists.";
    }
}